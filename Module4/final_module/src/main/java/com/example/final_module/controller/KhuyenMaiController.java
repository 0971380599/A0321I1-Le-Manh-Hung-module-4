package com.example.final_module.controller;



import com.example.final_module.model.KhuyenMai;
import com.example.final_module.service.customer.KhuyenMaiService;
import com.example.final_module.validate.KhuyenMaiValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Optional;


@Controller
public class KhuyenMaiController {
    @Autowired
    KhuyenMaiService khuyenMaiService;
    @Autowired
    KhuyenMaiValidate khuyenMaiValidate;

    @GetMapping({"", "/list"})
    public String getList(Model model, @PageableDefault(size = 3) Pageable pageable, Optional<String> batDau, Optional<String> ketThuc,
                          Optional<String> giaBatDau, Optional<String> giaKetThuc) {
        Page<KhuyenMai> khuyenMais = khuyenMaiService.findAll(pageable);
        if(batDau.isPresent() && !batDau.get().equals("")) {
            khuyenMais = khuyenMaiService.findByThoiGianBatDau(batDau.get(), pageable);
        }else if (ketThuc.isPresent()&& !ketThuc.get().equals("")) {
            khuyenMais = khuyenMaiService.findByThoiGianKetThuc(ketThuc.get(), pageable);
        } else if (giaBatDau.isPresent() && giaKetThuc.isPresent() && !giaBatDau.get().equals("") && !giaKetThuc.get().equals("")) {
            System.out.println(giaBatDau);
            khuyenMais = khuyenMaiService.findByGia(Float.parseFloat(giaBatDau.get()), Float.parseFloat(giaKetThuc.get()), pageable);
        }
        model.addAttribute("khuyenMais", khuyenMais);
        return "List";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("khuyenMai", new KhuyenMai());
        return "Create";
    }

    @PostMapping("/create/save")
    public String saveCreate(@Valid @ModelAttribute KhuyenMai khuyenMai, BindingResult bindingResult) {
        khuyenMaiValidate.validate(khuyenMai, bindingResult);
        if(bindingResult.hasErrors()) {
            return "Create";
        }
        khuyenMaiService.save(khuyenMai);
        return "redirect:/list";
    }

    @PostMapping("update/save")
    public String saveUpdate(@Validated @ModelAttribute KhuyenMai khuyenMai, BindingResult bindingResult) {
        khuyenMaiValidate.validate(khuyenMai, bindingResult);
        if(bindingResult.hasErrors()) {
            return "Update";
        }
        khuyenMaiService.save(khuyenMai);
        return "redirect:/list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("khuyenMai", khuyenMaiService.findById(id));
        return "Update";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Integer id) {
        khuyenMaiService.delete(id);
        return "redirect:/list";
    }
}
