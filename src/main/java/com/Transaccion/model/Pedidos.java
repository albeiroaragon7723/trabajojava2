package com.Transaccion.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pedidos")
@AllArgsConstructor
@NoArgsConstructor
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @Nullable
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Clientes clientes;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Productos productos;
    private LocalDateTime orderDate = LocalDateTime.now();
    private Integer quantity;
}
