package org.example.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Employee controller", description = "Employee management APIs")
@RequiredArgsConstructor
@RestController
public class EmployeeController {

  private final EmployeeService employeeService;

  @GetMapping("/employee")
  public List<Employee> getAllEmployees(@RequestParam(defaultValue = "0", name = "page") int page,
                                        @RequestParam(defaultValue = "5", name = "size") int size) {
    return employeeService.getAllEmployees(page, size);
  }


}
