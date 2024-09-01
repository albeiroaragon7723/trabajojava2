package com.Transaccion.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "productos")
@AllArgsConstructor
@NoArgsConstructor
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private Double price;
}
