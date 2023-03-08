package co.simplon.matchmydev.auth.dtos;

import javax.validation.constraints.NotNull;

public class AccountStatusUpdate {

    @NotNull
    private Boolean active;

    public Boolean getActive() {
	return active;
    }

    public void setActive(Boolean active) {
	this.active = active;
    }

    @Override
    public String toString() {
	return "AccountStatusUpdate [active=" + active + "]";
    }

}
