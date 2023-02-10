package co.simplon.matchmydev.auth.services;

import java.util.Collection;

import co.simplon.matchmydev.auth.dtos.SignInDto;
import co.simplon.matchmydev.auth.dtos.UserAccountCreate;
import co.simplon.matchmydev.auth.dtos.UserAccountView;

public interface UserAccountService {
    void create(UserAccountCreate inputs);

    Collection<UserAccountView> getAll();

    String signIn(SignInDto credentials);

}
