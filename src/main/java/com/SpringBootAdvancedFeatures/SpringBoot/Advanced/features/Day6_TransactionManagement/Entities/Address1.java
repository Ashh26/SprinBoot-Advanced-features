package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "add_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    // One-to-one mapping: one employee has one address
    @OneToOne
    private Employee1 employee;
}
