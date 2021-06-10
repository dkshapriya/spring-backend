package com.example.angast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.angast.model.Influencer;

@Repository 
public interface InfluencerRepository extends JpaRepository<Influencer, Long>{

}
