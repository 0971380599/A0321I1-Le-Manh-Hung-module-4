package codegym.controller;

import codegym.model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SettingController {
    public static Setting settingUpdate = new Setting();
    @GetMapping({"","/setting"})
    public String setting(Model model) {
        Setting setting = new Setting();
        setting = settingUpdate;
        model.addAttribute("setting", setting);
        return "setting";
    }
    @PostMapping("/settingUpdate")
    public String save(@ModelAttribute Setting setting, Model model) {
        settingUpdate = setting;
        model.addAttribute("setting" , settingUpdate);
        return "setting";
    }
}
