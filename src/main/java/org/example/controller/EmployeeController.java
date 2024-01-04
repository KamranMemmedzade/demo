package org.example.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.example.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Employee controller", description = "Employee management APIs")
@RestController
public class EmployeeController {


  @GetMapping("/employee")
  public List<Employee> getAllEmployees() {
    var employeeList = new ArrayList<Employee>();
    employeeList.add(Employee.builder()
        .name("John")
        .salary(BigDecimal.valueOf(1000))
        .build());

    employeeList.add(Employee.builder()
        .name("Alex")
        .salary(BigDecimal.valueOf(1172))
        .build());
    return employeeList;
  }


}
