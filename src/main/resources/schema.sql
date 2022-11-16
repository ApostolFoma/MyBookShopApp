DROP TABLE IF EXISTS author_letters;
DROP TABLE IF EXISTS authors;
DROP TABLE IF EXISTS books;

CREATE TABLE author_letters
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    letter   VARCHAR(1) NOT NULL
);

CREATE TABLE authors
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    author_letters_id INT REFERENCES author_letters(id) NOT NULL,
    first_name VARCHAR(50),
    last_name  VARCHAR(50)
);

CREATE TABLE books
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    authors_id INT REFERENCES authors(id) NOT NULL,
    author   VARCHAR(250) NOT NULL,
    title    VARCHAR(250) NOT NULL,
    priceOld VARCHAR(250) DEFAULT NULL,
    price    VARCHAR(250) DEFAULT NULL
);
