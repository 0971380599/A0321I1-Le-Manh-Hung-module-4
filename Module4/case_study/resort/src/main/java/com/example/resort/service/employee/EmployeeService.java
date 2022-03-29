package com.example.resort.service.employee;

import com.example.resort.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    void save(Employee employee);

    Employee findById(int id);

    void deleteById(int idEmployee);
}
