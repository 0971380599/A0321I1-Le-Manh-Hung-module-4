package com.example.final_module.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "không được để trống")
    private int id;

    @Column(columnDefinition = "VARCHAR(45)")
    @NotBlank(message = "không được để trống")
    private String tieuDe;

    @NotNull(message = "không được để trống")
    @Column(columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate thoiGianBatDau;
    @NotNull(message = "không được để trống")
    @Column(columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate thoiGianKetThuc;

    @NotNull(message = "không được để trống")
    private float mucGiamGia;

    @NotBlank(message = "không được để trống")
    private String chiTiet;
    public KhuyenMai() {
    }

    public KhuyenMai(@NotNull int id, @NotBlank String tieuDe, LocalDate thoiGianBatDau, LocalDate thoiGianKetThuc, @NotNull float mucGiamGia, @NotBlank String chiTiet) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.mucGiamGia = mucGiamGia;
        this.chiTiet = chiTiet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public LocalDate getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(LocalDate thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public LocalDate getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(LocalDate thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public float getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(float mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
}
