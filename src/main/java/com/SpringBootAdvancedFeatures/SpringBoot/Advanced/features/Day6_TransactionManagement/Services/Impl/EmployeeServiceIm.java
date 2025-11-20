package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Services.Impl;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Entities.Address1;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Entities.Employee1;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Repsitories.Employee1Repository;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Services.AddressService1;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Services.EmployeeService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceIm implements EmployeeService1 {
    @Autowired
    private Employee1Repository employeeRepository;

    @Autowired
    private AddressService1 addressService;

    @Transactional(rollbackFor = Exception.class)
    public Employee1 addEmployee(Employee1 employee) throws Exception {
        Employee1 employeeSavedToDB = this.employeeRepository.save(employee);

        // Create address for employee
        // Intentional null to simulate failure

        Address1 address = null;
        address.setId(123L);
        address.setAddress("Varanasi");
        address.setEmployee(employee);

        // This may throw an exception intentionally for testing rollback
        if (employee.getName().equalsIgnoreCase("error")) {
            throw new RuntimeException("Simulated Exception: Forcing rollback!");
        }

        this.addressService.addAddress(address);
        return employeeSavedToDB;
    }
}
