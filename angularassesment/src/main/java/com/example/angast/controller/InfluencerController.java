package com.example.angast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.angast.model.Influencer;
import com.example.angast.repository.InfluencerRepository;

@CrossOrigin(origins="http://localhost:4200")

@RestController
@RequestMapping("/api/v1/")
public class InfluencerController {

	@Autowired
	private InfluencerRepository influencerRepository;
	
	//get all influencers
	
	@GetMapping("/influencers")
	public List<Influencer> getAllInfluencer(){
		return influencerRepository.findAll();
	}
	
	//create influencer rest api
	@PostMapping("/influencers")
	public Influencer createInfluencer(@RequestBody Influencer influencer) {
		return influencerRepository.save(influencer);
	}
}

