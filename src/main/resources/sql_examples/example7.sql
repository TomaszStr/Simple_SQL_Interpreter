CREATE TYPE myEnum AS ENUM(
    'a',
    'b',
    'c'
    );
CREATE TABLE myTable(
    a myEnum,
    b myEnum,
    c myEnum
);