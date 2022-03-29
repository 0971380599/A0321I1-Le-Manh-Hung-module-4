package com.example.resort.controller;

import com.example.resort.model.Employee;
import com.example.resort.service.employee.DivisionService;
import com.example.resort.service.employee.EducationDegreeService;
import com.example.resort.service.employee.EmployeeService;
import com.example.resort.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    PositionService positionService;
    @Autowired
    EducationDegreeService educationDegreeService;
    @Autowired
    DivisionService divisionService;

    @GetMapping({"", "/list"})
    public String getList(Model model, @PageableDefault(size = 3) Pageable pageable) {
        Page<Employee> employees = employeeService.findAll(pageable);
        model.addAttribute("employees", employees);
        return "employee/EmployeeList";
    }
    @GetMapping("/create")
    public String createEmployee(Model model) {
        model.addAttribute("divisions", divisionService.findAll());
        model.addAttribute("positions", positionService.findAll());
        model.addAttribute("educationDegrees", educationDegreeService.findAll());
        model.addAttribute("employee", new Employee());
        return "employee/EmployeeCreate";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee/list";
    }
    @GetMapping("/update/{id}")
    public  String updateEmployee(Model model, @PathVariable("id") int id) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("divisions", divisionService.findAll());
        model.addAttribute("positions", positionService.findAll());
        model.addAttribute("educationDegrees", educationDegreeService.findAll());
        model.addAttribute("employee", employee);
        return "employee/EmployeeUpdate";
    }
    @PostMapping("/delete")
    public String deleteEmployee(@RequestParam int idEmployee) {
        employeeService.deleteById(idEmployee);
        return "redirect:/employee/list";
    }
}
