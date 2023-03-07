DROP TABLE IF EXISTS user_accounts;

CREATE TABLE user_accounts (

	id SERIAL PRIMARY KEY,
	internal_identifier VARCHAR (13) UNIQUE NOT NULL,
	internal_email VARCHAR (255) UNIQUE NOT NULL,
	password CHAR(60) NOT NULL,
	created_at TIMESTAMP NOT NULL,
	active BOOLEAN NOT NULL
	
);