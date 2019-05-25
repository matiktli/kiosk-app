package com.kiosk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public abstract class BaseDTO {

    @Null(message = "id should not be present on create", groups = CreateValidationGroup.class)
    @NotNull(message = "id should be present on update", groups = UpdateValidationGroup.class)
    private Integer id;

    @Null(message="createDate may not be present on create", groups = {CreateValidationGroup.class})
    private Timestamp createDate;

    @Null(message="updateDate may not be present on create", groups = {CreateValidationGroup.class})
    private Timestamp updateDate;

    @Null(message="createdByUser may not be present on create", groups = {CreateValidationGroup.class})
    private Integer createdByUser;

    @Null(message="updatedByUser may not be present on create", groups = {CreateValidationGroup.class})
    private Integer updatedByUser;


    public interface CreateValidationGroup {

    }

    public interface UpdateValidationGroup {

    }

}
