package co.simplon.matchmydev.auth.database;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.crypto.bcrypt.BCrypt;

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

    public static void addRandomAccount() {
	UserAccount randomAccount = new UserAccount();
	randomAccount.setInternalIdentifier("Jean");
	randomAccount.setInternalEmail("test@test.com");
	String hashPw = BCrypt.hashpw("toto",
		BCrypt.gensalt(10));
	randomAccount.setPassword(hashPw);
	randomAccount.setActive(false);
	randomAccount.setCreatedAt(LocalDateTime.now());

	Database.saveAccount(randomAccount);
    }
}
