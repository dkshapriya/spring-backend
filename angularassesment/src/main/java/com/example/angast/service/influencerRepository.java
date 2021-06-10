package com.example.angast.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.angast.model.Influencer;

public interface influencerRepository {
	@Repository 
	public interface InfluencerRepository extends JpaRepository<Influencer, Long>{

	}

	public static java.util.List<Influencer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
