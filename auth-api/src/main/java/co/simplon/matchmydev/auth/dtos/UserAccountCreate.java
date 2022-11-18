package co.simplon.matchmydev.auth.dtos;

public class UserAccountCreate {
    private String internalIdentifier;
    private String internalEmail;
    private String password;

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
	return password;
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
