package co.simplon.matchmydev.auth.dtos;

import java.time.LocalDateTime;

public class UserAccountView {
    private String internalIdentifier;
    private String internalEmail;
    private String password;
    private boolean active;
    private LocalDateTime createdAt;

    public UserAccountView() {
	super();
    }

    public String getInternalIdentifier() {
	return internalIdentifier;
    }

    public void setInternalIdentifier(String internalIdentifier) {
	this.internalIdentifier = internalIdentifier;
    }

    public String getInternalEmail() {
	return internalEmail;
    }

    public void setInternalEmail(String internalEmail) {
	this.internalEmail = internalEmail;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }

    public LocalDateTime getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
    }

    @Override
    public String toString() {
	return "UserAccountView [internalIdentifier=" + internalIdentifier
		+ ", internalEmail=" + internalEmail + ", password=" + password
		+ ", active=" + active + ", createdAt=" + createdAt + "]";
    }

}
