CREATE TYPE myEnum AS ENUM(
    'a',
    'b',
    'c'
    );
CREATE TABLE myTable(
    id INTEGER PRIMARY KEY,
    a myEnum,
    b myEnum,
    c myEnum
);