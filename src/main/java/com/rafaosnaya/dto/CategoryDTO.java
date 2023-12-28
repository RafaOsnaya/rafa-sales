package com.rafaosnaya.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    private Integer id;
    private String nameCategory;
    private String descriptionCategory;
    private String enabledCategory;
}
