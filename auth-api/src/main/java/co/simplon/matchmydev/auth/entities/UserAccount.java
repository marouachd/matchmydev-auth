package co.simplon.matchmydev.auth.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_accounts")
public class UserAccount extends AbstractEntity {
    @Column(name = "internal_identifier")
    private String internalIdentifier;

    @Column(name = "internal_email")
    private String internalEmail;

    @Column(name = "password")
    private String password;

    @Column(name = "active")
    private boolean active;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;

    public UserAccount() {
	super();
    }

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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
		return "UserAccount [internalIdentifier=" + internalIdentifier + ", internalEmail=" + internalEmail
				+ ", password=" + password + ", active=" + active + ", createdAt=" + createdAt + ", role=" + role + "]";
	}

}