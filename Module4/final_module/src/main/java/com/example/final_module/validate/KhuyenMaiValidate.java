package com.example.final_module.validate;

import java.time.LocalDate;

import com.example.final_module.model.KhuyenMai;

import com.example.final_module.service.customer.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class KhuyenMaiValidate implements Validator {
    @Autowired
    KhuyenMaiService khuyenMaiService;

    @Override
    public boolean supports(Class<?> clazz) {
        return KhuyenMai.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        KhuyenMai khuyenMai = (KhuyenMai) target;

        if (!(khuyenMai.getThoiGianBatDau() == null && khuyenMai.getThoiGianKetThuc() == null)) {
            System.out.println(khuyenMai.getThoiGianBatDau());
            if (khuyenMai.getThoiGianBatDau().isBefore(LocalDate.now())) {
                errors.rejectValue("thoiGianBatDau", "", "Thời gian bắt đầu phải lớn hơn thời gian hiện tại");
            }
            if (khuyenMai.getThoiGianKetThuc().isBefore(khuyenMai.getThoiGianBatDau())) {
                errors.rejectValue("thoiGianKetThuc", "", "Thời gian kết thúc phải lớn hơn thời gian bắt đầu");
            }
        }
        if (khuyenMai.getMucGiamGia() < 10000.0) {
            errors.rejectValue("mucGiamGia", "", "Mức giảm giá phải lớn hơn 10.000");
        }
    }

}
