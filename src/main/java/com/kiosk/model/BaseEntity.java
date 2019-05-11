package com.kiosk.model;

import com.kiosk.security.SecurityUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEntity {


    @Column(name = "create_date", updatable = false)
    @CreationTimestamp
    private Timestamp createDate;

    @Column(name = "update_date")
    @UpdateTimestamp
    private Timestamp updateDate;

    @Column(name = "created_by_user", updatable = false)
    private Integer createdByUser;

    @Column(name = "updated_by_user")
    private Integer updatedByUser;

    @PrePersist
    protected void prePersist() {
        SecurityUtils.getCurrentUserOptional()
                .ifPresent(user -> {
                    createdByUser = user.getId();
                    updatedByUser = user.getId();
                });
    }

    @PreUpdate
    protected void preUpdate() {
        SecurityUtils.getCurrentUserOptional()
                .ifPresent(user -> updatedByUser = user.getId());
    }
}
