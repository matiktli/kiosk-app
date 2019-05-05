package com.kiosk.security.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;
import com.kiosk.model.User;
import com.kiosk.model.type.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserPrincipal implements UserDetails {

    private Integer id;

    private UserType type;

    @JsonIgnore
    private String username;

    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority> authorities;


    public static UserPrincipal create(User user) {
        List<GrantedAuthority> authorities = Lists.newArrayList(new SimpleGrantedAuthority(user.getType().name()));

        return UserPrincipal.builder()
                .id(user.getId())
                .password(user.getPassword())
                .username(user.getEmail())
                .type(user.getType())
                .authorities(authorities)
                .build();
    }

    public User getUserData() {
        return new User(getId(), getType(), "---", "---", getUsername(), getPassword(), "---", null);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
