-- Table: campus
CREATE TABLE campus (
  id integer AUTO_INCREMENT NOT NULL,
  name varchar(32)  NOT NULL,
  description varchar(500)  NULL,
  contact varchar(100)  NOT NULL,
  location_id integer  NULL,
  CONSTRAINT campus_pk PRIMARY KEY (id)
) ;