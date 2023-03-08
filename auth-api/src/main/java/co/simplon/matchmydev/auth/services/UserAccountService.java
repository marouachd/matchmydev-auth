package co.simplon.matchmydev.auth.services;

import java.util.Collection;

import co.simplon.matchmydev.auth.dtos.SignInDto;
import co.simplon.matchmydev.auth.dtos.SignUpDto;
import co.simplon.matchmydev.auth.dtos.UserAccountCreate;
import co.simplon.matchmydev.auth.dtos.UserAccountView;

public interface UserAccountService {
    void createSignUp(SignUpDto inputs);

    void createAccount(UserAccountCreate inputs);

    Collection<UserAccountView> getAll();

    String signIn(SignInDto credentials);

}
