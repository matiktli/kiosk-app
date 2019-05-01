-- Table: logs
CREATE TABLE logs (
  id integer  NOT NULL,
  user_id integer  NULL,
  timestamp timestamp  NOT NULL,
  action_type varchar(32)  NOT NULL,
  action varchar(500)  NOT NULL,
  CONSTRAINT logs_pk PRIMARY KEY (id)
) ;