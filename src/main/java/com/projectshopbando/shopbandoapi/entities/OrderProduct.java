package com.projectshopbando.shopbandoapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "order_products")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String size;
    private Integer quantity;

    private BigDecimal unitPrice;
    private BigDecimal totalPrice;

    @ManyToOne()
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}
