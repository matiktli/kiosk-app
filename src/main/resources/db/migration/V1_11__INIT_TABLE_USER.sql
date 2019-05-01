-- Table: user
CREATE TABLE "user" (
  id integer  NOT NULL,
  user_type char(32)  DEFAULT USER NOT NULL,
  first_name char(32)  NOT NULL,
  last_name char(32)  NOT NULL,
  email char(50)  NOT NULL,
  password char(32)  NOT NULL,
  student_number integer  NULL,
  user_personalization_id integer  NULL,
  CONSTRAINT user_uq_email UNIQUE (email),
  CONSTRAINT user_pk PRIMARY KEY (id)
) ;