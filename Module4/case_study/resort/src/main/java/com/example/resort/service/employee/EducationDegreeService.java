package com.example.resort.service.employee;

import com.example.resort.model.EducationDegree;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EducationDegreeService {
    List<EducationDegree> findAll();
}
