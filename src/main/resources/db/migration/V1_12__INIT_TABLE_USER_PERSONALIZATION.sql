-- Table: user_personalization
CREATE TABLE user_personalization (
  id integer AUTO_INCREMENT NOT NULL,
  fav_event_types varchar(500)  NULL,
  CONSTRAINT user_personalization_pk PRIMARY KEY (id)
) ;