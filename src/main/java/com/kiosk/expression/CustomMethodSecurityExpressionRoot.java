package com.kiosk.expression;

import com.kiosk.exception.SecurityException;
import com.kiosk.model.User;
import com.kiosk.security.user.UserPrincipal;
import org.springframework.security.access.expression.SecurityExpressionRoot;
import org.springframework.security.access.expression.method.MethodSecurityExpressionOperations;
import org.springframework.security.core.Authentication;

import java.util.Optional;

public class CustomMethodSecurityExpressionRoot extends SecurityExpressionRoot implements MethodSecurityExpressionOperations {


    public CustomMethodSecurityExpressionRoot(Authentication authentication) {
        super(authentication);
    }

    public boolean isIdMatching(Integer idToCompare) {
        User currentUser = getCurrentUser()
                .orElseThrow(() -> new SecurityException("User not present in context"));
        return currentUser.getId().equals(idToCompare);
    }

    private Optional<User> getCurrentUser() {
        if (this.authentication.getPrincipal() != null && this.authentication.getPrincipal() instanceof UserPrincipal) {
            return Optional.of(((UserPrincipal) this.authentication.getPrincipal()).getUserData());
        }
        return Optional.empty();
    }

    @Override
    public void setFilterObject(Object filterObject) {

    }

    @Override
    public Object getFilterObject() {
        return null;
    }

    @Override
    public void setReturnObject(Object returnObject) {

    }

    @Override
    public Object getReturnObject() {
        return null;
    }

    @Override
    public Object getThis() {
        return null;
    }
}
