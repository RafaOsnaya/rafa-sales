package com.rafaosnaya.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(IngressDetailPK.class)
public class IngressDetail {

    //@SuppressWarnings("JpaAttributeTypeInspection")
    @Id
    private Ingress ingress;

    //@SuppressWarnings("JpaAttributeTypeInspection")
    @Id
    private Product product;

    @Column(nullable = false)
    private short quantity;

    @Column(columnDefinition = "decimal(10,2)", nullable = false)
    private short cost;
}
