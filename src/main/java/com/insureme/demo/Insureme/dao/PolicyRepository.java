package com.insureme.demo.Insureme.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insureme.demo.Insureme.entity.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
}
