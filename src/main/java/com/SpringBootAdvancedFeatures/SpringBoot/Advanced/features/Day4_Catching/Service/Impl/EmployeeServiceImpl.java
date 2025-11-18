package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Service.Impl;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Entity.EmployeeEntity;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Repository.EmployeeRepository;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        System.out.println("Saved the records");
        return employeeRepository.save(employeeEntity);
    }

    @Cacheable(value = "employeeEntity",key = "#id")
    @Override
    public EmployeeEntity getEmployeeById(int id) {
        System.out.println("Get the Employee by id: "+id);
        return employeeRepository.findById(id).orElse(null) ;
    }

    @CachePut(value = "employeeEntity",key = "#employeeEntity.id")
    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        System.out.println("Update the record with id: "+employeeEntity.getId());
        return employeeRepository.save(employeeEntity);
    }

    @CacheEvict(value = "employeeEntity",key = "#id")
    @Override
    public void deleteEmployee(int id) {
        System.out.println("Delete the record with id: "+id);
        employeeRepository.deleteById(id);
    }
}
