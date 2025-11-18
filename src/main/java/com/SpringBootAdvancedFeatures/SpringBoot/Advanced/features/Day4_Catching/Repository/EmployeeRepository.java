package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Repository;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {
}
