CREATE TABLE Rights
(
    id serial PRIMARY KEY,
    right_name CHARACTER VARYING (200)
);

CREATE TABLE Roles
(
    id serial PRIMARY KEY,
    role_name CHARACTER VARYING (200)
);

CREATE TABLE RoleRights
(
    role_id INTEGER REFERENCES Roles(id),
    right_id INTEGER REFERENCES Rights(id)
);

CREATE TABLE Categories
(
    id serial PRIMARY KEY,
    category_name CHARACTER VARYING (200)
);

CREATE TABLE Statemets
(
    id serial PRIMARY KEY,
    statement CHARACTER VARYING (200)
);

CREATE TABLE Users
(
    id serial PRIMARY KEY,
    user_name CHARACTER VARYING (200),
    role_id INTEGER REFERENCES Roles(id)
);

CREATE TABLE Requests
(
    id serial PRIMARY KEY,
    request_name CHARACTER VARYING (200),
    category_id INTEGER REFERENCES Categories(id),
    statement_id INTEGER REFERENCES Statemets(id),
    user_id INTEGER REFERENCES Users(id)
);

CREATE TABLE Comments
(
    id serial PRIMARY KEY,
    request_id INTEGER REFERENCES Requests(id),
    comment_text CHARACTER VARYING (200),
    user_id INTEGER REFERENCES Users(id)
);

CREATE TABLE Files
(
    id serial PRIMARY KEY,
    file_name CHARACTER VARYING (200),
    link CHARACTER VARYING (200),
    request_id INTEGER REFERENCES Requests(id),
    user_id INTEGER REFERENCES Users(id),
    comment_id INTEGER REFERENCES Comments(id)
);