package com.kiosk.dto;

import com.kiosk.model.type.TagRefType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TagDTO extends BaseDTO {

    private TagRefType refType;

    private Long refId;

    private String value;
}
