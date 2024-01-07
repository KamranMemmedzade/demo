package org.example.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.instancio.Instancio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeService {


  private final EmployeeRepository employeeRepository;

  public List<Employee> getAllEmployees(int page, int size) {
    //generateTestData();
    Pageable paging = PageRequest.of(page, size);
    Page<Employee> employeePage = employeeRepository.findAll(paging);
    return employeePage.getContent();
  }

  private void generateTestData() {

    List<Employee> employees = Instancio.ofList(Employee.class).size(100).create();
    employees.forEach(employee -> log.info("employee {}", employee));
    employeeRepository.saveAll(employees);

    log.info("Test data generated");
  }

}
