package co.simplon.matchmydev.auth.dtos;

public interface UserAccountView {
	Long getId();
	String getInternalIdentifier();
	String getInternalEmail();
	String getPassword();
	
}
