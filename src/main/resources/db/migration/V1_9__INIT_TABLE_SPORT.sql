-- Table: sport
CREATE TABLE sport (
  id integer AUTO_INCREMENT NOT NULL,
  type varchar(32)  NOT NULL,
  name varchar(32)  NOT NULL,
  training_times varchar(500)  NULL,
  description varchar(500)  NULL,
  location_id integer  NULL,
  CONSTRAINT sport_pk PRIMARY KEY (id)
) ;