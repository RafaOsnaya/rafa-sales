package com.rafaosnaya.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Ingress {


    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIngress;

    @ManyToOne
    @JoinColumn(name = "id_provider", nullable = false, foreignKey = @ForeignKey(name = "Fk_Ingress_Provider"))
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false, foreignKey = @ForeignKey(name = "Fk_Ingress_User"))
    private User user;

    @Column(nullable = false)
    private LocalDateTime dateTime;

    @Column(columnDefinition = "decimal(10,2)", nullable = false)
    private double total;

    @Column(columnDefinition = "decimal(10,2)", nullable = false)
    private double tax;

    @Column(length = 20, nullable = false)
    private String serialNumber;

    @Column(nullable = false)
    private boolean enabled;
}
