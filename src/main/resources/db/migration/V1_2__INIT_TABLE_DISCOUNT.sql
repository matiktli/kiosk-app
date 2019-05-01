-- Table: discount
CREATE TABLE discount (
  id integer  NOT NULL,
  name char(32)  NOT NULL,
  description char(500)  NULL,
  start_date date  NOT NULL,
  end_date date  NOT NULL,
  amount integer  NOT NULL,
  organizator char(32)  NULL,
  location_id integer  NULL,
  CONSTRAINT discount_pk PRIMARY KEY (id)
) ;