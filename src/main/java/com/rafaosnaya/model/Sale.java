package com.rafaosnaya.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Sale {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSale;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false, foreignKey = @ForeignKey(name = "Fk_Sale_Client"))
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false, foreignKey = @ForeignKey(name = "Fk_Sale_User"))
    private User user;

    @Column(nullable = false)
    private LocalDateTime dateTime;


    @Column(columnDefinition = "decimal(10,2)", nullable = false)
    private double total;

    @Column(columnDefinition = "decimal(10,2)", nullable = false)
    private double tax;

    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private List<SaleDetail> details;


}
