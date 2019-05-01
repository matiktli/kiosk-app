-- Table: tag
CREATE TABLE tag (
  id integer  NOT NULL,
  ref_type varchar(32)  NOT NULL,
  ref_id integer  NOT NULL,
  value varchar(16)  NOT NULL,
  CONSTRAINT tag_uq_ref_id_value UNIQUE (ref_id, value),
  CONSTRAINT tag_pk PRIMARY KEY (id)
) ;