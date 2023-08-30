package com.insureme.demo.Insureme.entity;

//import org.hibernate.annotations.Entity;
//
//@Entity
public class Policy {
   public Long id;
   public String policyName;
   
   public void setId(Long id) {
	   this.id = id;
   }
   
   public Long getId() {
	   return id;
   }
   
   public void setPolicyName(String policyName) {
	   this.policyName = policyName;
   }
   
   public String getPolicyName() {
	   return policyName;
   }

   
}
