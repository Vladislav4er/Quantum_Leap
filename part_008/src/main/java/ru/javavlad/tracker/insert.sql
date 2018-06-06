INSERT INTO Rights(right_name) values ('read');

INSERT INTO Roles(role_name) values ('president');

INSERT INTO RoleRights(role_id, right_id) values(1, 1);

INSERT INTO Users(user_name, role_id) values('Vladimir Putin', 1);

INSERT INTO Statemets(statement) values('in process');

INSERT INTO Categories(category_name) values('vip');

INSERT INTO Requests(request_name, category_id, statement_id, user_id) values('Главная заявка', 1, 1, 1);

INSERT INTO Comments(request_id, comment_text, user_id) values(1, 'первый комментарий главной заявки', 1);

INSERT INTO files(file_name, link, request_id, comment_id) values('Название файла', 'https://yandex.ru/', 1, 1);

