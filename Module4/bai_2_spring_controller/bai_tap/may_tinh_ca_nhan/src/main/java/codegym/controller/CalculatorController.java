package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("")
    public String calculator() {
        return "calculator";
    }

    @PostMapping("/calculator")
    public String calculator(@RequestParam String value1, String value2, String calculation, Model model) {
        double value = 0;
        if (calculation.equals("add")) {
            value = Double.parseDouble(value1) + Double.parseDouble(value2);
        }
        if (calculation.equals("sub")) {
            value = Double.parseDouble(value1) - Double.parseDouble(value2);
        }
        if (calculation.equals("mul")) {
            value = Double.parseDouble(value1) * Double.parseDouble(value2);
        }
        if (calculation.equals("div")) {
            value = Double.parseDouble(value1) / Double.parseDouble(value2);
        }
        model.addAttribute("value", value);
        return "calculator";
    }
}
