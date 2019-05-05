package com.kiosk.security;

import com.kiosk.controller.BaseKioskController;
import com.kiosk.model.User;
import lombok.experimental.UtilityClass;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@UtilityClass
public class SecurityUtils {

    public static final String[] FILTER_DISABLED = {
            BaseKioskController.USER_LOGIN_URL,
            BaseKioskController.USER_REGISTER_URL
    };

    public static User getCurrentUser() {
        User currentUser = null;
        SecurityContext context = SecurityContextHolder.getContext();
        if (context != null) {
            Authentication auth = context.getAuthentication();
            if (auth != null && auth.getPrincipal() instanceof UserPrincipal ) {
                UserPrincipal principal = (UserPrincipal) auth.getPrincipal();
                return principal.getUserData();
            }
        }
        return currentUser;
    }
}
