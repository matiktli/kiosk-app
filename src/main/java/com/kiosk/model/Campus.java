package com.kiosk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "campus")
@NoArgsConstructor
@AllArgsConstructor
public class Campus extends BasicEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "contact", nullable = false)
    private String contact;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;

}
