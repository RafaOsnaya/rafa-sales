package com.rafaosnaya.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class SaleDetail {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSaleDetail;


    @ManyToOne
    @JoinColumn(name = "id_sale", nullable = false, foreignKey = @ForeignKey(name = "Fk_Sale_detail_Sale"))
    private Sale sale;


    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false, foreignKey = @ForeignKey(name = "Fk_Sale_Detail_Product"))
    private Product product;

    @Column(nullable = false)
    private short quantity;

    @Column(columnDefinition = "decimal(10,2)", nullable = false)
    private double price;

    @Column(columnDefinition = "decimal(10,2)", nullable = false)
    private Double discount;

}
