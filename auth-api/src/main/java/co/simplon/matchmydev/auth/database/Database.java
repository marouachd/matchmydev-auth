package co.simplon.matchmydev.auth.database;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import co.simplon.matchmydev.auth.entities.UserAccount;

public class Database {
    private static Long accountId = 0L;

    private static final Map<Long, UserAccount> USERACCOUNTS = new HashMap<>(); // j'instacie

    public static void saveAccount(UserAccount userAccount) {
	accountId++;
	userAccount.setId(accountId);
	USERACCOUNTS.put(accountId, userAccount);
    }

    public static Collection<UserAccount> findAll() {
	return USERACCOUNTS.values();
    }
}
