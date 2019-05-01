-- Table: room
CREATE TABLE room (
  id integer  NOT NULL,
  floor integer  NOT NULL,
  location_id integer  NULL,
  CONSTRAINT room_pk PRIMARY KEY (id)
) ;