-- Bank Provider
ALTER TABLE bank_provider ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE bank_provider ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE bank_provider ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE bank_provider ADD COLUMN updated_by_user varchar(32) NULL;

-- Campus
ALTER TABLE campus ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE campus ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE campus ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE campus ADD COLUMN updated_by_user varchar(32) NULL;

-- Discount
ALTER TABLE discount ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE discount ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE discount ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE discount ADD COLUMN updated_by_user varchar(32) NULL;

-- Event
ALTER TABLE event ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE event ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE event ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE event ADD COLUMN updated_by_user varchar(32) NULL;

-- Location
ALTER TABLE location ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE location ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE location ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE location ADD COLUMN updated_by_user varchar(32) NULL;

-- Log
ALTER TABLE logs ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE logs ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE logs ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE logs ADD COLUMN updated_by_user varchar(32) NULL;

-- Room
ALTER TABLE room ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE room ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE room ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE room ADD COLUMN updated_by_user varchar(32) NULL;

-- Room Booking
ALTER TABLE room_booking ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE room_booking ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE room_booking ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE room_booking ADD COLUMN updated_by_user varchar(32) NULL;

-- Sport
ALTER TABLE sport ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE sport ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE sport ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE sport ADD COLUMN updated_by_user varchar(32) NULL;

-- Tag
ALTER TABLE tag ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE tag ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE tag ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE tag ADD COLUMN updated_by_user varchar(32) NULL;

-- User
ALTER TABLE user ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE user ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE user ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE user ADD COLUMN updated_by_user varchar(32) NULL;

-- User Personalization
ALTER TABLE user_personalization ADD COLUMN create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE user_personalization ADD COLUMN update_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE user_personalization ADD COLUMN created_by_user varchar(32) NULL;
ALTER TABLE user_personalization ADD COLUMN updated_by_user varchar(32) NULL;