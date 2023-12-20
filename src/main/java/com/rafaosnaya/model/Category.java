package com.rafaosnaya.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
//@Table(name = "tbl_category")
public class Category {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategory;

    @Column(name = "category_name", nullable = false, length = 50)
    private String name;

    @Column(name = "category_description", nullable = false, length = 150)
    private String description;

    @Column(name = "category_enabled", nullable = false)
    private boolean enabled;

}
