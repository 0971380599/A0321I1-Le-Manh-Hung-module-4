package com.example.final_module.service.customer;


import com.example.final_module.model.KhuyenMai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface KhuyenMaiService {
    List<KhuyenMai> findAll();

    Page<KhuyenMai> findAll(Pageable pageable);

    void save(KhuyenMai customer);

    KhuyenMai findById(int id);

    void delete(Integer id);

    Page<KhuyenMai> findByThoiGianBatDau(String localDate, Pageable pageable);

    Page<KhuyenMai> findByThoiGianKetThuc(String localDate, Pageable pageable);

    Page<KhuyenMai> findByGia(Float batDau, Float ketThuc, Pageable pageable);
}
