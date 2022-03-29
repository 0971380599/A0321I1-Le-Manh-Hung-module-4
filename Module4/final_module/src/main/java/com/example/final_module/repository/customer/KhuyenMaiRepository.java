package com.example.final_module.repository.customer;


import com.example.final_module.model.KhuyenMai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface KhuyenMaiRepository extends JpaRepository<KhuyenMai, Integer> {
    Page<KhuyenMai> findByThoiGianBatDau(LocalDate batDau, Pageable pageable);
    Page<KhuyenMai> findByThoiGianKetThuc(LocalDate ketthuc, Pageable pageable);
    @Query("select k from KhuyenMai k where k.mucGiamGia between :batDau and :ketThuc")
    Page<KhuyenMai> findByGia(Float batDau, Float ketThuc, Pageable pageable);
}
