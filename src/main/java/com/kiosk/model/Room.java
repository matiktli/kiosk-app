package com.kiosk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "room")
@NoArgsConstructor
@AllArgsConstructor
public class Room extends BasicEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "floor", nullable = false)
    private Integer floor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Location location;

}
