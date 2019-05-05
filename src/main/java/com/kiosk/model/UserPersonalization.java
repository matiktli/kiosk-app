package com.kiosk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_personalization")
@NoArgsConstructor
@AllArgsConstructor
public class UserPersonalization extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "fav_event_types", nullable = false)
    private String favEventTypes;
}
