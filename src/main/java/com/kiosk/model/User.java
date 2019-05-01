package com.kiosk.model;

import com.kiosk.model.type.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User extends BasicEntity {

    @Column(name = "user_type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private UserType type;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "student_number")
    private String studentNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_personalization_id", referencedColumnName = "id")
    private UserPersonalization userPersonalization;

}
