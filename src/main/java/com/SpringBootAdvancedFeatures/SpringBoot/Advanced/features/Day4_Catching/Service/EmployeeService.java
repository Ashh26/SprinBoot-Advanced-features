package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Service;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day4_Catching.Entity.EmployeeEntity;

public interface EmployeeService {
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    public EmployeeEntity getEmployeeById(int id);
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    public void deleteEmployee(int id);
}
