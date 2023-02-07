DELETE FROM user_accounts;

INSERT INTO user_accounts
	(internal_identifier, internal_email, password, created_at, active)
	VALUES
	('JMADINI020585','juliette.madinier@socgen.com', '$2a$10$9hiBbD8yhrWIoU6uc/gzb.vKKTi4Bz28KyY0ONI7Hpq9dfPW9/Ili' , now(), true),
	('MSOLTAN122488', 'maroua.soltani@socgen.com', '$2a$10$VvcpKIEMank2jZMr9AWKruCSI/7sYQbcX5CQum.3oFBUqzr35cy1u',now(), true ),
	('THLUTON051194', 'thomas.luton@socgen.com','$2a$10$PFjiE5LUs1/JTxQmbZYd2OqgcyMsLUCrlqJUEQP46EIoahdhcAO4K',now(), false);
	