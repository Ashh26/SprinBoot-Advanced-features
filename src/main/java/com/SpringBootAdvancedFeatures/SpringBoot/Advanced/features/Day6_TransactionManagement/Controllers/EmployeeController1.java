package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Controllers;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Entities.Employee1;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day6_TransactionManagement.Services.EmployeeService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController1 {

    @Autowired
    private EmployeeService1 employeeService;

    @PostMapping("/add")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee1 employee) {
        try {
            Employee1 employeeSaved = employeeService.addEmployee(employee);
            return ResponseEntity.ok(employeeSaved);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Transaction failed: " + e.getMessage());
        }
    }

}
