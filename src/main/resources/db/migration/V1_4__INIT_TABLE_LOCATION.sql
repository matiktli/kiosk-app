-- Table: location
CREATE TABLE location (
  id integer  NOT NULL,
  name char(32)  NOT NULL,
  latitude float(50)  NULL,
  longitude float(50)  NULL,
  description char(500)  NULL,
  CONSTRAINT location_pk PRIMARY KEY (id)
) ;