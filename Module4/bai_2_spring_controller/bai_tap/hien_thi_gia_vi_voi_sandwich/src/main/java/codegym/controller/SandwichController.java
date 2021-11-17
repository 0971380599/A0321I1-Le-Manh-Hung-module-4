package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
public class SandwichController {
    @GetMapping({"","/sandwich"})
    public String sandwichOption() {
        return "viewOptionSandwich";
    }

    @PostMapping("/sandwichOption")
    public String sandwichOptionViews(@RequestParam (required = false) String[] Condiments, Model model) {
        model.addAttribute("condiments" , Condiments);
        System.out.println(Arrays.toString(Condiments));
        return "viewOptionSandwich";
    }
}
