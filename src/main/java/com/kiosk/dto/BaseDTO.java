package com.kiosk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDTO {

    @Null(message = "id should not be present on create", groups = CreateValidationGroup.class)
    @NotNull(message = "id should be present on update", groups = UpdateValidationGroup.class)
    private Integer id;


    public interface CreateValidationGroup {

    }

    public interface UpdateValidationGroup {

    }

}
