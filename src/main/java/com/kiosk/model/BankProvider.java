package com.kiosk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bank_provider")
@NoArgsConstructor
@AllArgsConstructor
public class BankProvider extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "overdraft", nullable = false)
    private Integer overdraft;

    @Column(name = "incentive", nullable = false)
    private String incentive;

    @Column(name = "student_score", nullable = false)
    private Double studentScore;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Location location;

}
