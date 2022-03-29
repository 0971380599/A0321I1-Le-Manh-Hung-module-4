package com.example.resort.repository.employee;

import com.example.resort.model.EducationDegree;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepository extends CrudRepository<EducationDegree, Integer> {
}
