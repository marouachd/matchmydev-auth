package co.simplon.matchmydev.auth.dtos;

import java.time.LocalDateTime;

public interface UserAccountView {
    Long getId();

    String getInternalIdentifier();

    String getInternalEmail();

    String getPassword();

    LocalDateTime getCreatedAt();

    String getRoleId();

    boolean isActive();
}
