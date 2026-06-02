package demo.ss16_2.controller;

import demo.ss16_2.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @GetMapping("/api/v1/employees")
    public List<Employee> getEmployees() {
        return List.of(
            new Employee(1L, "Nguyễn Văn A", 5000.0),
            new Employee(2L, "Trần Văn B", 7000.0),
            new Employee(3L, "Lê Văn C", 9000.0)
        );
    }
}