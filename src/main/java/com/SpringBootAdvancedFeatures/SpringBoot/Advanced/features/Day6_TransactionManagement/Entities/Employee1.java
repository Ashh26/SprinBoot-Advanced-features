package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emp_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
