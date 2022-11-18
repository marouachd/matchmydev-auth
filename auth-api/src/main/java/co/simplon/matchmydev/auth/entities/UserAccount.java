package co.simplon.matchmydev.auth.entities;

public class UserAccount {
    private String internalIdentifier;
    private String internalEmail;
    private String password;
    private Long id;

    public UserAccount() {
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

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    @Override
    public String toString() {
	return "UserAccount [internalIdentifier=" + internalIdentifier
		+ ", internalEmail=" + internalEmail + ", password=" + password
		+ ", id=" + id + "]";
    }

}
