package com.fee_heads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fee_heads.entity.FeeHeadsEntity;

@Repository

public interface FeeHeadRepo extends JpaRepository<FeeHeadsEntity, Integer> {

}
