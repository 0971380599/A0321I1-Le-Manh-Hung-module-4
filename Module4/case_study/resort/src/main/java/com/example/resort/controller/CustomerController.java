package com.example.resort.controller;

import com.example.resort.model.Customer;
import com.example.resort.service.customer.CustomerService;
import com.example.resort.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping({"", "/list"})
    public String getList(Model model, @PageableDefault(size = 3) Pageable pageable) {
      Page<Customer> customers = customerService.findAll(pageable);
      model.addAttribute("customers", customers);
      model.addAttribute("customerTypes", customerTypeService.findAll());
        return "customer/CustomerList";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerTypes", customerTypeService.findAll());
        return "customer/CustomerCreate";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("customerTypes", customerTypeService.findAll());
        return "customer/CustomerUpdate";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Integer id) {
        customerService.delete(id);
        return "redirect:/customer/list";
    }
}
