package com.purelighters.purelighters.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name = "CUSTOMER_ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private String email;
}
