package codegym.controller;

import codegym.model.Customer;
import codegym.service.CustomerService;
import codegym.service.impl.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/")
    public String index(Model model, RedirectAttributes redirect) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        redirect.addFlashAttribute("success", null);
        return "CustomerList";
    }
    @GetMapping("/customer/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "CustomerCreate";
    }
    @PostMapping("/customer/save")
    public String save(Customer customer, RedirectAttributes redirect) {
        customer.setId((int)(Math.random() * 10000));
        customerService.save(customer);
        redirect.addFlashAttribute("success", "successfully added new");
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "CustomerEdit";
    }
    @PostMapping("/customer/update")
    public String update(Customer customer) {
        customerService.update(customer.getId(), customer);
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "CustomerDelete";
    }
    @PostMapping("/customer/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "CustomerView";
    }
}
