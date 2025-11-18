package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Controller;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Entity.EmployeeEntity;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<EmployeeEntity> saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return new ResponseEntity<>(employeeService.saveEmployee(employeeEntity), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<EmployeeEntity> updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        return new ResponseEntity<>(employeeService.updateEmployee(employeeEntity),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") int id){
        return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


}









