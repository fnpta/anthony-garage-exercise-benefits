package com.garage.lab.benefits.repository;

import com.garage.lab.benefits.entity.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenefitsRepository extends JpaRepository<Benefits, String>{

      Benefits findByEmpId (String empId);
}
