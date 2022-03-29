package com.example.final_module.service.customer.impl;


import com.example.final_module.model.KhuyenMai;
import com.example.final_module.repository.customer.KhuyenMaiRepository;
import com.example.final_module.service.customer.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class KhuyenMaiServiceImpl implements KhuyenMaiService {
    @Autowired
    KhuyenMaiRepository khuyenMaiRepository;


    @Override
    public List<KhuyenMai> findAll() {
        return khuyenMaiRepository.findAll();
    }

    @Override
    public Page<KhuyenMai> findAll(Pageable pageable) {
        return khuyenMaiRepository.findAll(pageable);
    }

    @Override
    public void save(KhuyenMai khuyenMai) {
        khuyenMaiRepository.save(khuyenMai);
    }

    @Override
    public KhuyenMai findById(int id) {
        return khuyenMaiRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        khuyenMaiRepository.deleteById(id);
    }

    @Override
    public Page<KhuyenMai> findByThoiGianBatDau(String localDate, Pageable pageable) {
        LocalDate batDau = LocalDate.parse(localDate);
        return khuyenMaiRepository.findByThoiGianBatDau(batDau, pageable);
    }

    @Override
    public Page<KhuyenMai> findByThoiGianKetThuc(String localDate, Pageable pageable) {
        LocalDate ketThuc = LocalDate.parse(localDate);
        return khuyenMaiRepository.findByThoiGianKetThuc(ketThuc, pageable);
    }

    @Override
    public Page<KhuyenMai> findByGia(Float batDau, Float ketThuc, Pageable pageable) {
        return khuyenMaiRepository.findByGia(batDau, ketThuc,pageable);
    }

}
