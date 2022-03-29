package com.example.resort.service.employee.impl;

import com.example.resort.model.Division;
import com.example.resort.repository.employee.DivisionRepository;
import com.example.resort.service.employee.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return (List<Division>) divisionRepository.findAll();
    }
}
