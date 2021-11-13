package codegym.controller;

import codegym.model.Customer;
import codegym.service.CustomerService;
import codegym.service.impl.SimpleCustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    static CustomerService customerService = new SimpleCustomerServiceImpl();

    @GetMapping("/customers")
    public String showList(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "list";
    }
    @GetMapping("/customers/info")
    public String showInfo(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "info";
    }
}