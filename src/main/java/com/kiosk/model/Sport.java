package com.kiosk.model;

import com.kiosk.model.type.SportType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sport")
@NoArgsConstructor
@AllArgsConstructor
public class Sport extends BasicEntity {

    @Column(name = "type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private SportType type;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "training_times")
    private String trainingTimes;

    @Column(name = "description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

}
