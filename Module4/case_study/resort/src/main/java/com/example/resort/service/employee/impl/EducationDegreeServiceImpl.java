package com.example.resort.service.employee.impl;

import com.example.resort.model.EducationDegree;
import com.example.resort.repository.employee.EducationDegreeRepository;
import com.example.resort.service.employee.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return (List<EducationDegree>) educationDegreeRepository.findAll();
    }
}
