-- Table: user
CREATE TABLE user (
  id integer  NOT NULL,
  user_type varchar(32) NOT NULL,
  first_name varchar(32)  NOT NULL,
  last_name varchar(32)  NOT NULL,
  email varchar(50)  NOT NULL,
  password varchar(32)  NOT NULL,
  student_number integer  NULL,
  user_personalization_id integer  NULL,
  CONSTRAINT user_uq_email UNIQUE (email),
  CONSTRAINT user_pk PRIMARY KEY (id)
) ;