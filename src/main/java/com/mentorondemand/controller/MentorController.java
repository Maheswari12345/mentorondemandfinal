package com.mentorondemand.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.model.Mentor;
import com.mentorondemand.model.MentorCalendar;
import com.mentorondemand.model.MentorSkills;
import com.mentorondemand.repo.MentorRepository;
import com.mentorondemand.repo.MentorSkillRepository;

@CrossOrigin(origins = "http://localhost:4321")
@RestController
@RequestMapping("/api")
public class MentorController {
	@Autowired
	   MentorRepository mentorRepo;
	
	@Autowired
	   MentorSkillRepository skillRepo;
	
	@Autowired
	   MentorCalendarRepository calendarRepo;
	
	@PostMapping("/mentorregister")
	public Mentor mentorregister(Mentor mentor)
	{
		return mentorRepo.save(mentor);
	}
	@GetMapping("/mentorlist")
	public List<Mentor> getmentors()
	{
		return (List<Mentor>) mentorRepo.findAll();
	}
		@GetMapping("/getMentorDetails/{id}")
		public List getAllCustomers(@PathVariable long id) {
			
			List mentor=new ArrayList();
			System.out.println("Get the Mentor details...");
		    Optional<MentorSkills> skillList=skillRepo.findByMentorId(id);
            Optional<Mentor> mentorDetails=mentorRepo.findById(id);
           Optional<MentorCalendar> calendarList=calendarRepo.findByMentorId(id);
          
            
            mentor.add(mentorDetails);
            mentor.add(skillList);
            mentor.add(calendarList);
			return  mentor;
		}
}
