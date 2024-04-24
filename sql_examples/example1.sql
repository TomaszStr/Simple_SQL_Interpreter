CREATE TABLE mytable(
                        number INTEGER DEFAULT 1,
                        s season
);
CREATE ENUM season(
    'winter','spring','summer','fall'
);
CREATE TABLE mytable2(
    liczba FLOAT
);
CREATE DOMAIN wiekszeniz5 INTEGER CHECK(wiekszeniz5 > 5);
CREATE TYPE typ AS (liczba INTEGER, napis TEXT);