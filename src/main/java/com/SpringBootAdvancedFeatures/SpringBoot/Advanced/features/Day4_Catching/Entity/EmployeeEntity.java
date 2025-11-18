package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    private String address;

}
