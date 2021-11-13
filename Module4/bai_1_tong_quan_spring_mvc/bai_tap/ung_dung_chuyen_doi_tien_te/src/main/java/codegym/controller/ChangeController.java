package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeController {
    @GetMapping("")
    public String change() {
        return "viewChange";
    }

    @PostMapping("/change")
    public String changeMoney(@RequestParam String usd, String rate, Model model) {
        float vnd = Float.parseFloat(usd) * Float.parseFloat(rate);
        model.addAttribute("vnd" , vnd);
        return "viewChange";
    }
}
