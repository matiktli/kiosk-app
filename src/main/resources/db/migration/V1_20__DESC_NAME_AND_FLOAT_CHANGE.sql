ALTER TABLE `room_booking` MODIFY start_date timestamp NULL;
ALTER TABLE `room_booking` MODIFY end_date timestamp NULL;

-- Bank Provider
ALTER TABLE `bank_provider` MODIFY name varchar(500) NOT NULL;

-- Campus
ALTER TABLE `campus` MODIFY name varchar(500) NOT NULL;
ALTER TABLE `campus` MODIFY description varchar(2500) NULL;

-- Discount
ALTER TABLE `discount` MODIFY name varchar(500) NOT NULL;

-- Event
ALTER TABLE `event` MODIFY name varchar(500) NOT NULL;
ALTER TABLE `event` MODIFY description varchar(2500) NULL;

-- Location
ALTER TABLE `location` MODIFY name varchar(500) NOT NULL;
ALTER TABLE `location` MODIFY description varchar(2500) NULL;
ALTER TABLE `location` MODIFY latitude float(8,4) NOT NULL;
ALTER TABLE `location` MODIFY longitude float(8,4) NOT NULL;

-- Sport
ALTER TABLE `sport` MODIFY name varchar(500) NOT NULL;
ALTER TABLE `sport` MODIFY description varchar(2500) NULL;
