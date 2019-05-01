-- Table: event
CREATE TABLE event (
  id integer  NOT NULL,
  event_type varchar(32)  NOT NULL,
  name varchar(32)  NOT NULL,
  start_date date  NOT NULL,
  end_date date  NULL,
  description varchar(500)  NULL,
  location_id integer  NOT NULL,
  CONSTRAINT event_pk PRIMARY KEY (id)
) ;