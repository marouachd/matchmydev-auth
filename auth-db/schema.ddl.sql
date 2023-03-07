DROP TABLE IF EXISTS user_accounts;
DROP TABLE IF EXISTS roles;

CREATE TABLE roles (
	id SERIAL PRIMARY KEY,
	name VARCHAR (20) UNIQUE NOT NULL
);

CREATE TABLE user_accounts (

	id SERIAL PRIMARY KEY,
	internal_identifier VARCHAR (13) UNIQUE NOT NULL,
	internal_email VARCHAR (255) UNIQUE NOT NULL,
	password CHAR(60) NOT NULL,
	created_at TIMESTAMP NOT NULL,
	active BOOLEAN NOT NULL,
	role_id INTEGER,
	CONSTRAINT fk_role_id
		FOREIGN KEY (role_id)
		REFERENCES roles(id)
	
);