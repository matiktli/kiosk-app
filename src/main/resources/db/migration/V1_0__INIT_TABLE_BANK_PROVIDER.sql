-- Table: bank_provider
CREATE TABLE bank_provider (
  id integer  NOT NULL,
  name char(32)  NOT NULL,
  overdraft integer  NOT NULL,
  incentive char(100)  NOT NULL,
  student_score float(100)  NOT NULL,
  location_id integer  NULL,
  CONSTRAINT bank_provider_pk PRIMARY KEY (id)
) ;