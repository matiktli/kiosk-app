package com.kiosk.model;

import com.kiosk.model.type.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user_personalization")
@NoArgsConstructor
@AllArgsConstructor
public class UserPersonalization extends BasicEntity {

    @Column(name = "fav_event_types", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private List<EventType> favEventTypes;
}
