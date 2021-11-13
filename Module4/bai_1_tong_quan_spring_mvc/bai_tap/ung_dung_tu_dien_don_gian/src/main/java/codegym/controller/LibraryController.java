package codegym.controller;

import codegym.service.LibraryService;
import codegym.service.impl.LibraryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryController {
    public LibraryService libraryService = new LibraryServiceImpl();
    @GetMapping("")
    public String viewLibrary() {
        return "library";
    }

    @PostMapping("/library")
    public String findLibrary(@RequestParam String english, Model model) {
        String vietNam = libraryService.find(english);
        model.addAttribute("vietNam", vietNam);
        return "library";
    }
}
