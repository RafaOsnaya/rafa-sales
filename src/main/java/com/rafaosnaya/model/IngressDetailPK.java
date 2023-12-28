package com.rafaosnaya.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode
@Embeddable
public class IngressDetailPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_ingress", nullable = false, foreignKey = @ForeignKey(name = "FK_Ingress_detail_Ingress"))
    private Ingress ingress;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false, foreignKey = @ForeignKey(name = "FK_Ingress_detail_Product"))
    private Product product;
}
