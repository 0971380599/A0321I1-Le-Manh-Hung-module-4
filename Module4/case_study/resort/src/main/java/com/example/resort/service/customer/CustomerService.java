package com.example.resort.service.customer;

import com.example.resort.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> findAll();

    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    Customer findById(int id);

    void delete(Integer id);
}
