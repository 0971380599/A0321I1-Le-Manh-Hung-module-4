package com.example.resort.service.customer;

import com.example.resort.model.CustomerType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerTypeService {
    List<CustomerType> findAll();
}
