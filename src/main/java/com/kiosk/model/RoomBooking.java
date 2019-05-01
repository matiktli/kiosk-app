package com.kiosk.model;

import com.kiosk.model.type.RoomBookingType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "room_booking")
@NoArgsConstructor
@AllArgsConstructor
public class RoomBooking extends BasicEntity {

    @Column(name = "type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private RoomBookingType type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id", referencedColumnName = "id", nullable = false)
    private Room room;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @Column(name = "start_date", nullable = false)
    private Timestamp startDate;

    @Column(name = "end_date", nullable = false)
    private Timestamp endDate;

}
