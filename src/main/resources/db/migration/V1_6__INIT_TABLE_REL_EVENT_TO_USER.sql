-- Table: rel_event_to_user
CREATE TABLE rel_event_to_user (
  event_id integer  NOT NULL,
  user_id integer  NOT NULL,
  CONSTRAINT rel_event_to_user_pk PRIMARY KEY (event_id)
) ;