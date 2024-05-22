CREATE TYPE season AS ENUM(
    'winter','spring','summer','fall'
);
CREATE TABLE mytable(
             number INTEGER DEFAULT -123,
        str1 VARCHAR(10),
    str2 TEXT REFERENCES mytable2 NOT NULL UNIQUE,
    flt FLOAT,
    PRIMARY KEY(number),
    FOREIGN KEY(flt) REFERENCES mytable2(liczba)
);
CREATE TABLE mytable2(
    liczba FLOAT
);
CREATE DOMAIN nonull INTEGER NOT NULL;
CREATE TYPE typ AS (liczba INTEGER, napis TEXT);