package com.Transaccion.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "clientes")
@AllArgsConstructor
@NoArgsConstructor
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    private String email;
    private String phoneNumber;
}
//{
//    "customerName": "Juan Pérez",
//    "email": "juan.perez@example.com",
//    "phoneNumber": "123456789"
//}