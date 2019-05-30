package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.LoginRequest;
import com.kiosk.dto.RegisterRequest;
import com.kiosk.dto.UserDTO;
import com.kiosk.model.User;
import com.kiosk.model.type.UserType;
import com.kiosk.security.SecurityUtils;
import com.kiosk.security.jwt.JwtTokenProvider;
import com.kiosk.security.jwt.JwtTokenResponse;
import com.kiosk.service.base.UserService;
import com.kiosk.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class UserController extends BaseController<UserDTO, User>{

    @Autowired
    public UserController(UserTransformer transformer, UserService service) {
        super(transformer, service);
    }

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PreAuthorize("hasAuthority('ADMIN') || isUserMatching(#id)")
    @GetMapping(value = USER_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<UserDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping(value = USER_BASE_URL)
    @Override
    public ResponseEntity<Page<UserDTO>> findAll(@PageableDefault(size = 1000) Pageable page) {
        return super.findAll(page);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping(value = USER_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<UserDTO> create(@Valid @RequestBody UserDTO dto) {
        return super.create(dto);
    }

    @PreAuthorize("(hasAuthority('ADMIN') || isUserMatching(#id)) && #id == #dto.id")
    @PutMapping(value = USER_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<UserDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody UserDTO dto) {
        return super.update(id, dto);
    }

    @PreAuthorize("hasAuthority('ADMIN') || isUserMatching(#id)")
    @DeleteMapping(value = USER_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        logout();
        return super.delete(id);
    }

    @PostMapping(value = USER_REGISTER_URL)
    @Validated
    public ResponseEntity<JwtTokenResponse> register(@RequestBody RegisterRequest registerRequest) {
        Optional<User> currentAuth = SecurityUtils.getCurrentUserOptional();
        UserDTO userDTO = UserDTO.builder()
                .email(registerRequest.getEmail())
                .firstName(registerRequest.getFirstName())
                .lastName(registerRequest.getLastName())
                .password(registerRequest.getPassword())
                .studentNumber(registerRequest.getStudentNumber())
                .type(currentAuth.isPresent() && currentAuth.get().getType() == UserType.ADMIN && registerRequest.getUserType() != null ? registerRequest.getUserType() : UserType.USER)
                .build();
        User userToSave = transformer.toEntity(userDTO);
        service.save(userToSave);
        return login(new LoginRequest(registerRequest.getEmail(), registerRequest.getPassword()));
    }

    @PostMapping(value = USER_LOGIN_URL)
    @Validated
    public ResponseEntity<JwtTokenResponse> login(@RequestBody LoginRequest loginRequest) {
        Authentication auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(auth);
        String jwt = jwtTokenProvider.generateToken(auth);
        return ResponseEntity.ok(new JwtTokenResponse(jwt));
    }

    @PostMapping(value = USER_LOGOUT_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    public ResponseEntity<Void> logout() {
        //Might not be proper idea
        SecurityContextHolder.getContext().setAuthentication(null);
        return ResponseEntity.ok().build();
    }
}
