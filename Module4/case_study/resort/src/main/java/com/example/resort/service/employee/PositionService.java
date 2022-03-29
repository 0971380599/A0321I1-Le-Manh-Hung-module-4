package com.example.resort.service.employee;

import com.example.resort.model.Position;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PositionService {
    List<Position> findAll();
}
