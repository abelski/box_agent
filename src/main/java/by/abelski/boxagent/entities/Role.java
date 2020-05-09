package by.abelski.boxagent.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,
    CLIENT,
    COURIER;

    @Override
    public String getAuthority() {
        return name();
    }
}
