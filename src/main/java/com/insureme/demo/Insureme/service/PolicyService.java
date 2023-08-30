package com.insureme.demo.Insureme.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insureme.demo.Insureme.entity.Policy;
import com.insureme.demo.Insureme.dao.PolicyRepository;


@Service
public class PolicyService {
	@Autowired
	private PolicyRepository policyRepository;
	
	public Policy createPolicy(Policy policy) {
		return policyRepository.save(policy);
	}
	
	public Policy viewPolicyById(Long id) {
		return policyRepository.findById(id).orElse(null);
	}
	
	public Policy updatePolicy(Policy policy) {
		Policy oldPolicy = null;
		Optional<Policy> optionalPolicy = policyRepository.findById(policy.getId());
		if(optionalPolicy.isPresent()) {
			oldPolicy = optionalPolicy.get();
			oldPolicy.setId(policy.getId());
			oldPolicy.setPolicyName(policy.getPolicyName());
			policyRepository.save(oldPolicy);
		} else {
			return new Policy();
		}
		return oldPolicy;
	}
	
	public String deletePolicy(Long id) {
		policyRepository.deleteById(id);
		return "Deleted Successfully!!!";
		
	}
	
}