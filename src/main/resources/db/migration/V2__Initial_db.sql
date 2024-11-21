-- Users table (removed role and authorities columns since we'll use roles_has_users)
CREATE TABLE IF NOT EXISTS users
(
    id          BIGSERIAL PRIMARY KEY,
    first_name  VARCHAR(255) NOT NULL,
    last_name   VARCHAR(255) NOT NULL,
    email       VARCHAR(255) NOT NULL UNIQUE,
    password    VARCHAR(255) NOT NULL
);