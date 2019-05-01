-- Table: logs
CREATE TABLE logs (
  id integer  NOT NULL,
  user_id integer  NULL,
  timestamp timestamp  NOT NULL,
  action_type char(32)  NOT NULL,
  action char(500)  NOT NULL,
  CONSTRAINT logs_pk PRIMARY KEY (id)
) ;