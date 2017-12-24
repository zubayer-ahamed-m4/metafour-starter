package com.metafour.starter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.metafour.starter.model.Course;
import com.metafour.starter.model.Degree;

@Service
public class DegreeService {

	private List<Degree> degrees = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		degrees.add(new Degree("ssc", "SSC"));
		degrees.add(new Degree("hsc", "HSC"));
		degrees.add(new Degree("honours", "Honours"));
		degrees.add(new Degree("msc", "Masters"));
	}

	public List<Degree> getDegrees() {
		return degrees;
	}

	public List<Degree> findBy(String hint) {
		return hint.equals("?") ? degrees : degrees.stream().filter(d -> d.getCode().toLowerCase().contains(hint.toLowerCase()) || d.getDescription().toLowerCase().contains(hint.toLowerCase())).collect(Collectors.toList());
	}
	
}
