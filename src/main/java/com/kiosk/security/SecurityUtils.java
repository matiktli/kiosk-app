package com.kiosk.security;

import com.kiosk.controller.BaseKioskController;
import com.kiosk.model.User;
import com.kiosk.security.user.UserPrincipal;
import lombok.experimental.UtilityClass;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@UtilityClass
public class SecurityUtils {

    public static final String[] LOGIN_REGISTER_PATHS = {
            BaseKioskController.USER_LOGIN_URL,
            BaseKioskController.USER_REGISTER_URL
    };

    public static final String[] SWAGGER_PATHS = {
            "/v2/api-docs",
            "/configuration/ui",
            "/swagger-resources/**",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**"
    };

    public static Optional<User> getCurrentUser() {
        Optional<User> currentUser = Optional.empty();
        SecurityContext context = SecurityContextHolder.getContext();
        if (context != null) {
            Authentication auth = context.getAuthentication();
            if (auth != null && auth.getPrincipal() instanceof UserPrincipal) {
                UserPrincipal principal = (UserPrincipal) auth.getPrincipal();
                return Optional.of(principal.getUserData());
            }
        }
        return currentUser;
    }
}
