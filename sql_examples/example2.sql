CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    UserName VARCHAR(50),
    Email VARCHAR(50) UNIQUE,
    Age INT
);