-- Table: bank_provider
CREATE TABLE bank_provider (
  id integer AUTO_INCREMENT NOT NULL,
  name char(32)  NOT NULL,
  overdraft integer  NOT NULL,
  incentive char(100)  NOT NULL,
  student_score float(5, 2)  NOT NULL,
  location_id integer  NULL,
  CONSTRAINT bank_provider_pk PRIMARY KEY (id)
) ;