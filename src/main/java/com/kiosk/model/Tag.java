package com.kiosk.model;

import com.kiosk.model.type.TagRefType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tag")
@NoArgsConstructor
@AllArgsConstructor
public class Tag extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "ref_type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private TagRefType refType;

    @Column(name = "ref_id", nullable = false)
    private Long refId;

    @Column(name = "value")
    private String value;

}
