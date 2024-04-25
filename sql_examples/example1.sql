CREATE TYPE season AS ENUM(
    'winter','spring','summer','fall'
);
CREATE TABLE mytable(
                        number INTEGER DEFAULT 1,
                        s nonull
);
CREATE TABLE mytable2(
    liczba FLOAT
);
CREATE DOMAIN nonull INTEGER NOT NULL;
CREATE TYPE typ AS (liczba INTEGER, napis TEXT);