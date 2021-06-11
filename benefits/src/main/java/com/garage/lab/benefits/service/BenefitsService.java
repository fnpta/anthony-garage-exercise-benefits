package com.garage.lab.benefits.service;

import com.garage.lab.benefits.entity.Benefits;
import com.garage.lab.benefits.repository.BenefitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenefitsService {
    @Autowired
    private BenefitsRepository benefitsRepository;

    public Benefits saveBenefits(Benefits benefits){
        System.out.println("in BenefitService=======>" + benefits.toString());
        return benefitsRepository.save(benefits);
    }
    public List<Benefits> saveBenefitsList(List<Benefits> benefitsList){
        return benefitsRepository.saveAll(benefitsList);
    }
    public List<Benefits> getBenefitsList() {
        return benefitsRepository.findAll();
    }
    public Benefits getBenefitsById(String benefitsId) {
        return benefitsRepository.findById(benefitsId).orElse(null);
    }

    public Benefits getBenefitsByEmpId(String empId) {
        return benefitsRepository.findByEmpId(empId);
    }

    public String deleteBenefits(String benefitsId) {
        benefitsRepository.deleteById(benefitsId);
        return "benefits removed !! " + benefitsId;
    }

    public Benefits updateBenefits(Benefits benefits) {
        Benefits existingBenefits = benefitsRepository.findById(benefits.getBenefitsId()).orElse(benefits);
        existingBenefits.setDescription(benefits.getDescription());
        existingBenefits.setDateStart(benefits.getDateStart());
        existingBenefits.setDateEnd(benefits.getDateEnd());
        //empId is a foreign key, not sure if it is updatable?
        existingBenefits.setEmpId(benefits.getEmpId());
        return benefitsRepository.save(existingBenefits);
    }




}
