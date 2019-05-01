package com.kiosk.model;

import com.kiosk.model.type.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "event")
@NoArgsConstructor
@AllArgsConstructor
public class Event extends BasicEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "event_type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private EventType type;

    @Column(name = "start_date", nullable = false)
    private Timestamp startDate;

    @Column(name = "end_date")
    private Timestamp endDate;

    @Column(name = "description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Location location;

}
