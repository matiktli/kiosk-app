-- Table: campus
CREATE TABLE campus (
  id integer  NOT NULL,
  name char(32)  NOT NULL,
  description char(500)  NULL,
  contact char(100)  NOT NULL,
  location_id integer  NULL,
  CONSTRAINT campus_pk PRIMARY KEY (id)
) ;