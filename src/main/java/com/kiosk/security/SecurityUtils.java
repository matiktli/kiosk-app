package com.kiosk.security;

import com.kiosk.controller.KioskAppService;
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
            KioskAppService.USER_LOGIN_URL,
            KioskAppService.USER_REGISTER_URL
    };

    public static final String[] PATHS_AVAILABLE_FOR_GUESTS = {
            KioskAppService.BANK_PROVIDER_BASE_URL,
            KioskAppService.CAMPUS_BASE_URL,
            KioskAppService.DISCOUNT_BASE_URL,
            KioskAppService.EVENT_BASE_URL,
            KioskAppService.LOCATION_BASE_URL,
            KioskAppService.LOG_BASE_URL,
            KioskAppService.ROOM_BOOKING_BASE_URL,
            KioskAppService.ROOM_BASE_URL,
            KioskAppService.SPORT_BASE_URL,
            KioskAppService.TAG_BASE_URL,
            KioskAppService.USER_BASE_URL,
            KioskAppService.USER_PERSONALIZATION_BASE_URL,

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
