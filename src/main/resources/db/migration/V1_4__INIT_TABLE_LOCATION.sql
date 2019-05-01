-- Table: location
CREATE TABLE location (
  id integer  NOT NULL,
  name varchar(32)  NOT NULL,
  latitude float(7,3)  NULL,
  longitude float(7, 3)  NULL,
  description varchar(500)  NULL,
  CONSTRAINT location_pk PRIMARY KEY (id)
) ;