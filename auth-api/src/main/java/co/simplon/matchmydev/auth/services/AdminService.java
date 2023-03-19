package co.simplon.matchmydev.auth.services;

import co.simplon.matchmydev.auth.dtos.UserAccountForUpdate;
import co.simplon.matchmydev.auth.dtos.UserAccountUpdate;

public interface AdminService {

    void updateStatus(Long id, String Active);

    UserAccountForUpdate forUpdate(Long id);

    void update(Long id, UserAccountUpdate inputs);

}
