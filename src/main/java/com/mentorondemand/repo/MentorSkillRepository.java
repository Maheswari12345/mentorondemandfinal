package com.mentorondemand.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.mentorondemand.model.MentorSkills;

public interface MentorSkillRepository extends CrudRepository<MentorSkills, Long>{

	Optional<MentorSkills> findByMentorId(long id);

}
