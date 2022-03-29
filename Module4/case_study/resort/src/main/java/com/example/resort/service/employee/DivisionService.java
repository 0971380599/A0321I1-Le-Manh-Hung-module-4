package com.example.resort.service.employee;

import com.example.resort.model.Division;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DivisionService {
    List<Division> findAll();
}
