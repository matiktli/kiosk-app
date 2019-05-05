-- Table: discount
CREATE TABLE discount (
  id integer AUTO_INCREMENT NOT NULL,
  name varchar(32)  NOT NULL,
  description varchar(500)  NULL,
  start_date date  NOT NULL,
  end_date date  NOT NULL,
  amount integer  NOT NULL,
  organizator varchar(32)  NULL,
  location_id integer  NULL,
  CONSTRAINT discount_pk PRIMARY KEY (id)
) ;