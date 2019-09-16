package com.mentorondemand.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mentorondemand.model.Mentor;


public interface MentorRepository extends CrudRepository<Mentor, Long> {

	Optional<Mentor> findById(long id);

}
