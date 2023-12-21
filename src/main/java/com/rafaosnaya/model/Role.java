package com.rafaosnaya.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Role {

    @EqualsAndHashCode.Include
    @Id
    private Integer idRole;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean enabled;




}
