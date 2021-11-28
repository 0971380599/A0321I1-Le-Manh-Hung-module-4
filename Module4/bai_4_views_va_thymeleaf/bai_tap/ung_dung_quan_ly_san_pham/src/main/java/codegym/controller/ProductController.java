package codegym.controller;

import codegym.model.Product;
import codegym.service.ProductService;
import codegym.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class ProductController {
    public ProductService productService = new ProductServiceImpl();
    @GetMapping("/")
    public String productList(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "ProductList";
    }

    @GetMapping("product/create")
    public String createProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product" , product);
        return "ProductCreate";
    }

    @PostMapping("products/save")
    public String save(Product product) {
        productService.save(product);
        return "redirect:/";
    }
    @GetMapping("/products/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "ProductEdit";
    }

    @PostMapping("/product/update")
    public String update(Product product) {
        productService.update(product.getProductID(),product);
        return "redirect:/";
    }

}
