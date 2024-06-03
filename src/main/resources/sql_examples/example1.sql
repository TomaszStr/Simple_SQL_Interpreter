CREATE TYPE season AS ENUM(
    'winter','spring','summer','fall'
);
CREATE TABLE mytable(
             number INTEGER,
        str1 VARCHAR(10) DEFAULT 'abc',
    str2 TEXT REFERENCES mytable2 NOT NULL UNIQUE,
    flt FLOAT,
    mybool BOOLEAN DEFAULT TRUE,
    PRIMARY KEY(number),
    FOREIGN KEY(flt) REFERENCES mytable3(liczba)
);
CREATE TABLE mytable2(
    str2 TEXT PRIMARY KEY
);
CREATE TABLE mytable3(
    liczba FLOAT PRIMARY KEY
);
CREATE DOMAIN nonull INTEGER NOT NULL;
CREATE TYPE typ AS (liczba INTEGER, napis TEXT);