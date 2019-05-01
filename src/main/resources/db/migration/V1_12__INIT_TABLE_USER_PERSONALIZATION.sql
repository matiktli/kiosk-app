-- Table: user_personalization
CREATE TABLE user_personalization (
  id integer  NOT NULL,
  fav_event_types char(500)  NULL,
  fav_place_types char(500)  NULL,
  CONSTRAINT user_personalization_pk PRIMARY KEY (id)
) ;