package com.insureme.demo.Insureme;

import com.insureme.demo.Insureme.service.PolicyService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.insureme.demo.Insureme.entity.Policy;

import jakarta.inject.Inject;

@SpringBootTest(classes = InsuremeApplicationTests.class)
public class InsureMeTest {
	
@Inject 
private PolicyService policyService;

@Test
public void createPolicy() {
	Policy policy = new Policy();
	policy.setId(12L);
	policy.setPolicyName("Vehicle Insurance");
	Policy policyCreated = policyService.createPolicy(policy);
	assertEquals(12, policyCreated.getId());
	
}
	
}