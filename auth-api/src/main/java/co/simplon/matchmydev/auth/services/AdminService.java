package co.simplon.matchmydev.auth.services;

import co.simplon.matchmydev.auth.dtos.AccountStatusUpdate;

public interface AdminService {

    void updateStatus(AccountStatusUpdate inputs, Long id);

}
