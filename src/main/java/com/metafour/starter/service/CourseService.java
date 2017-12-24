package com.metafour.starter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.metafour.starter.model.Course;
import com.metafour.starter.model.Port;

@Service
public class CourseService {

	private List<Course> courses = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		courses.add(new Course("java", "Java"));
		courses.add(new Course("php", "PHP"));
		courses.add(new Course("spring", "Spring"));
		courses.add(new Course("javascript", "JavaScript"));
		courses.add(new Course("python", "Python"));
		courses.add(new Course("wordpress", "Wordpress"));
	}

	public List<Course> getCourses() {
		return courses;
	}

	public List<Course> findBy(String hint) {
		return hint.equals("?") ? courses : courses.stream().filter(d -> d.getCode().toLowerCase().contains(hint.toLowerCase()) || d.getDescription().toLowerCase().contains(hint.toLowerCase())).collect(Collectors.toList());
	}
	
}
