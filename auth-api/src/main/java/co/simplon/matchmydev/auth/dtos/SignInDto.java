package co.simplon.matchmydev.auth.dtos;

import javax.validation.constraints.NotNull;

public class SignInDto {

    @NotNull
    private String emailOrIdentifier;
    @NotNull
    private String password;

    public SignInDto() {
	super();
	// TODO Auto-generated constructor stub
    }

    public String getEmailOrIdentifier() {
	return emailOrIdentifier;
    }

    public void setEmailOrIdentifier(String emailOrIdentifier) {
	this.emailOrIdentifier = emailOrIdentifier;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    @Override
    public String toString() {
	return "SignInDto [emailOrIdentifier=" + emailOrIdentifier
		+ ", password=" + password + "]";
    }

}
