package com.garage.lab.benefits.controller;

import com.garage.lab.benefits.entity.Benefits;
import com.garage.lab.benefits.service.BenefitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BenefitsController {

    @Autowired
    private BenefitsService benefitsService;

    @PostMapping("/lab/benefits/addBenefits")
    public Benefits addBenefits(@RequestBody Benefits benefits){
        System.out.println("=======>" + benefits.toString());
        return benefitsService.saveBenefits(benefits);
    }
    @PostMapping("/lab/benefits/addBenefitsList")
    public List<Benefits> addBenefitsList(@RequestBody List<Benefits> benefitsList) {
        return benefitsService.saveBenefitsList(benefitsList);
    }

    @GetMapping("/lab/benefits/findAllBenefits")
    public List<Benefits> findAllProducts() {
        return benefitsService.getBenefitsList();
    }

    @GetMapping("/lab/benefits/findBenefitsById/{benefitsId}")
    public Benefits findBenefitsById(@PathVariable String benefitsId){
        return benefitsService.getBenefitsById(benefitsId);
    }

    @GetMapping("/lab/benefits/findBenefitsByEmpId/{empId}")
    public Benefits findBenefitsByEmpId(@PathVariable String empId){
        return benefitsService.getBenefitsByEmpId (empId);
    }

    @PutMapping("/lab/benefits/updateBenefits")
    public Benefits updateBenefits(@RequestBody Benefits benefits){
        System.out.println("PUT =======>" + benefits.toString());
        return benefitsService.updateBenefits(benefits);
    }

    @DeleteMapping("/lab/benefits/deleteBenefits/{benefitsId}")
    public String deleteBenefits(@PathVariable String benefitsId){
        return benefitsService.deleteBenefits(benefitsId);
    }

}
