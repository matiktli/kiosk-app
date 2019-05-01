-- Table: room_booking
CREATE TABLE room_booking (
  id integer  NOT NULL,
  type char(32)  DEFAULT BOOKING NOT NULL,
  room_id integer  NOT NULL,
  user_id integer  NOT NULL,
  start_date date  NOT NULL,
  end_date date  NOT NULL,
  CONSTRAINT room_booking_pk PRIMARY KEY (id)
) ;