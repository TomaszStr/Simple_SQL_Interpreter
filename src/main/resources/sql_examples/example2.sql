CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    UserName VARCHAR(50) DEFAULT 'John Smith',
    Email VARCHAR(50) UNIQUE,
    Age INT
);