package com.example.resort.service.employee.impl;

import com.example.resort.model.Position;
import com.example.resort.repository.employee.PositionRepository;
import com.example.resort.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return (List<Position>) positionRepository.findAll();
    }
}
