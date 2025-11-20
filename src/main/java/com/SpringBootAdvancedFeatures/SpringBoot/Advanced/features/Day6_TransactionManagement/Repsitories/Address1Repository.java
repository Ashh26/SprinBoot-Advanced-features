package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Repsitories;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Entities.Address1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Address1Repository extends JpaRepository<Address1, Long> {
}
