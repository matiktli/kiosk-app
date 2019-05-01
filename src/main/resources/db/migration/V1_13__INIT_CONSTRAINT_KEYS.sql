-- foreign keys
-- Reference: bank_provider_location (table: bank_provider)
ALTER TABLE bank_provider ADD CONSTRAINT bank_provider_location
FOREIGN KEY (location_id)
REFERENCES location (id);

-- Reference: campus_location (table: campus)
ALTER TABLE campus ADD CONSTRAINT campus_location
FOREIGN KEY (location_id)
REFERENCES location (id);

-- Reference: discount_location (table: discount)
ALTER TABLE discount ADD CONSTRAINT discount_location
FOREIGN KEY (location_id)
REFERENCES location (id);

-- Reference: logs_user (table: logs)
ALTER TABLE logs ADD CONSTRAINT logs_user
FOREIGN KEY (user_id)
REFERENCES user (id);

-- Reference: place_event (table: event)
ALTER TABLE event ADD CONSTRAINT place_event
FOREIGN KEY (location_id)
REFERENCES location (id);

-- Reference: rel_event_to_user_event (table: rel_event_to_user)
ALTER TABLE rel_event_to_user ADD CONSTRAINT rel_event_to_user_event
FOREIGN KEY (event_id)
REFERENCES event (id);

-- Reference: rel_event_to_user_user (table: rel_event_to_user)
ALTER TABLE rel_event_to_user ADD CONSTRAINT rel_event_to_user_user
FOREIGN KEY (user_id)
REFERENCES user (id);

-- Reference: room_booking_user (table: room_booking)
ALTER TABLE room_booking ADD CONSTRAINT room_booking_user
FOREIGN KEY (user_id)
REFERENCES user (id);

-- Reference: room_location (table: room)
ALTER TABLE room ADD CONSTRAINT room_location
FOREIGN KEY (location_id)
REFERENCES location (id);

-- Reference: room_room_booking (table: room_booking)
ALTER TABLE room_booking ADD CONSTRAINT room_room_booking
FOREIGN KEY (room_id)
REFERENCES room (id);

-- Reference: sport_location (table: sport)
ALTER TABLE sport ADD CONSTRAINT sport_location
FOREIGN KEY (location_id)
REFERENCES location (id);

-- Reference: user_user_personalization (table: user)
ALTER TABLE user ADD CONSTRAINT user_user_personalization
FOREIGN KEY (user_personalization_id)
REFERENCES user_personalization (id);