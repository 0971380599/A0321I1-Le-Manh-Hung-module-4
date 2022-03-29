package com.example.resort.repository.employee;

import com.example.resort.model.Division;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends CrudRepository<Division, Integer> {
}
