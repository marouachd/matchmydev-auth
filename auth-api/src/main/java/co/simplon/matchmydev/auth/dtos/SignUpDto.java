package co.simplon.matchmydev.auth.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SignUpDto {
    @NotNull
    @Pattern(regexp = "^[A-Z]{2,7}[0-9]{6}")
    private String internalIdentifier;

    @NotNull
    @Pattern(regexp = "^[A-Za-z]+\\.[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]{2,4}")
    private String internalEmail;

    @NotNull
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[%||!||*])(?!.* ).{8,42}")
    private String password;

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
	return "SignUpDto [internalIdentifier=" + internalIdentifier
		+ ", internalEmail=" + internalEmail + ", password=" + password
		+ "]";
    }

}
