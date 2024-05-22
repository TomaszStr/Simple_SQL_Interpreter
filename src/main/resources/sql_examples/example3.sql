CREATE TABLE ExampleTable (
    Number INT,
    TeamID INT,
    Name VARCHAR(50),
    PRIMARY KEY (Number, TeamID)
);

CREATE TABLE ForeignTable (
    ExampleNumber INT,
    ExampleTeamID INT,
    ForeignData VARCHAR(50),
    FOREIGN KEY (ExampleNumber, ExampleTeamID) REFERENCES ExampleTable(Number, TeamID)
);