package co.simplon.matchmydev.auth.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_accounts")
public class UserAccount {
	@Column(name= "internal_identifier")
    private String internalIdentifier;
	
	@Column(name="internal_email")
    private String internalEmail;
	
	@Column(name="password")
    private String password;
	
	@Column(name="active")
    private boolean active;
	
	@Column(name="created_at")
    private LocalDateTime createdAt;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	return "UserAccount [internalIdentifier=" + internalIdentifier
		+ ", internalEmail=" + internalEmail + ", password=" + password
		+ ", active=" + active + ", createdAt=" + createdAt + ", id="
		+ id + "]";
    }

}
