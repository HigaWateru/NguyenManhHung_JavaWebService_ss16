package demo.ss16_1.controller;

import demo.ss16_1.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAllEmployees() {
        return List.of(
            new Employee(1L, "Nguyen Van A", 5000.0),
            new Employee(2L, "Tran Thi B", 5000.0),
            new Employee(3L, "Le Van C", 3000.0)
        );
    }
}