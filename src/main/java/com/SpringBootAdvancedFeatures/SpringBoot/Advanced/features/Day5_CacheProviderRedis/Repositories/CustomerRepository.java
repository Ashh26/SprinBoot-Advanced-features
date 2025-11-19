package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day5_CacheProviderRedis.Repositories;


import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day5_CacheProviderRedis.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("customerJpaRepository")
public interface CustomerRepository extends JpaRepository<Customer,String> {

    // this interface will provide all basic operations for Customer Entity
    // To create a custom query you can define a method for that.

}
