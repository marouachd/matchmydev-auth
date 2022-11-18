package co.simplon.matchmydev.auth.dtos;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class UserAccountCreate {
    private String internalIdentifier;
    private String internalEmail;
    private String password;
    private final int TOURS = 10;

    public UserAccountCreate() {
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
	String pw_hash = BCrypt.hashpw(password, BCrypt.gensalt(TOURS));
	return pw_hash;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    @Override
    public String toString() {
	return "AuthController [internalIdentifier=" + internalIdentifier
		+ ", internalEmail=" + internalEmail + ", password=" + password
		+ "]";
    }

}
