CREATE SCHEMA jungle;

CREATE table jungle.animal
(
  id   INT,
  name VARCHAR(50),
  legs INT,

  PRIMARY KEY (id)
);
CREATE table jungle.food
(
  id   INT,
  name VARCHAR(50),
  PRIMARY KEY (id)
);
