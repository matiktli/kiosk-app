package com.kiosk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user_personalization")
@NoArgsConstructor
@AllArgsConstructor
public class UserPersonalization extends BaseEntity {

    @Column(name = "fav_event_types", nullable = false)
    private String favEventTypes;
}
