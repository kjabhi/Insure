package com.insureme.demo.Insureme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insureme.demo.Insureme.entity.Policy;
import com.insureme.demo.Insureme.service.PolicyService;



@RestController
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @PostMapping("/createPolicy")
    public Policy createPolicy(@RequestBody Policy policy) {
    	return policyService.createPolicy(policy);
    }

    @PutMapping("/updatePolicy/{policyId}")
    public Policy updatePolicy(@PathVariable Long policyId, @RequestBody Policy policy) {
    	return policyService.updatePolicy(policy);
    }

    @GetMapping("/viewPolicy/{policyId}")
    public Policy viewPolicy(@PathVariable Long policyId) {
    	return policyService.viewPolicyById(policyId);
    }

    @DeleteMapping("/deletePolicy/{policyId}")
    public String deletePolicy(@PathVariable Long policyId) {
    	return policyService.deletePolicy(policyId);
    }
}
