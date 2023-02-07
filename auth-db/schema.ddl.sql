DROP TABLE IF EXISTS user_accounts;

CREATE TABLE user_accounts (

	id SERIAL PRIMARY KEY,
	internal_identifier VARCHAR NOT NULL,
	internal_email VARCHAR NOT NULL,
	password VARCHAR NOT NULL,
	created_at TIMESTAMP NOT NULL,
	active BOOLEAN 
	
)