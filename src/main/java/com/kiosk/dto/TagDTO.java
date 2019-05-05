package com.kiosk.dto;

import com.kiosk.model.type.TagRefType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TagDTO extends BaseDTO {

    @NotNull(message = "refType should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private TagRefType refType;

    @NotNull(message = "refId should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Long refId;

    @NotNull(message = "value should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String value;
}
