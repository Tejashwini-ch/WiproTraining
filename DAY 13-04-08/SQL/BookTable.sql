CREATE TABLE book (
    BookId INT NOT NULL UNIQUE,
    ISBN INT PRIMARY KEY,
    book_name VARCHAR(30) NOT NULL,
    author INT,
    ed_num INT,
    price INT,
    pages INT,
    FOREIGN KEY (author) REFERENCES author(author_id)
);