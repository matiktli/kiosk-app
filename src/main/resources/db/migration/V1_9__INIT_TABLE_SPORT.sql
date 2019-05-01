-- Table: sport
CREATE TABLE sport (
  id integer  NOT NULL,
  type char(32)  NOT NULL,
  name char(32)  NOT NULL,
  training_times char(500)  NULL,
  description char(500)  NULL,
  location_id integer  NULL,
  CONSTRAINT sport_pk PRIMARY KEY (id)
) ;