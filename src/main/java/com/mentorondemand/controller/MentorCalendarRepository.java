package com.mentorondemand.controller;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mentorondemand.model.MentorCalendar;

public interface MentorCalendarRepository extends CrudRepository<MentorCalendar, Long> {

	Optional<MentorCalendar> findByMentorId(long id);

}
