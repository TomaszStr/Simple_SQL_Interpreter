CREATE TABLE myTable(
    str TEXT NOT NULL DEFAULT 'aaa',
    intgr INTEGER DEFAULT 1,
    flt FLOAT UNIQUE,
    myBool BOOLEAN DEFAULT TRUE,
    PRIMARY KEY(intgr)
);