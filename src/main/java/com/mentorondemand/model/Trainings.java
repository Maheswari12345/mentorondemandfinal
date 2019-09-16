package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainings")
public class Trainings {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

@Column(name = "user_id")
private long userId;

@Column(name = "mentor_id")
private long mentorId;

@Column(name = "skill_id")
private long skillId;

@Column(name = "status")
private String status;

@Column(name = "progress")
private int progress;

@Column(name = "rating")
private int rating;

@Column(name = "start_date")
private String startDate;

@Column(name = "end_date")
private String endDate;

@Column(name = "start_time")
private String startTime;

@Column(name = "end_time")
private String endTime;

@Column(name = "amount_received")
private String amountReceived;


public Trainings() {
	super();
	// TODO Auto-generated constructor stub
}

public Trainings(long userId, long mentorId, long skillId, String status, int progress, int rating,
		String startDate, String endDate, String startTime, String endTime, String amountReceived) {
	super();
	this.userId = userId;
	this.mentorId = mentorId;
	this.skillId = skillId;
	this.status = status;
	this.progress = progress;
	this.rating = rating;
	this.startDate = startDate;
	this.endDate = endDate;
	this.startTime = startTime;
	this.endTime = endTime;
	this.amountReceived = amountReceived;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public long getUserId() {
	return userId;
}

public void setUserId(long userId) {
	this.userId = userId;
}

public long getMentorId() {
	return mentorId;
}

public void setMentorId(long mentorId) {
	this.mentorId = mentorId;
}

public long getSkillId() {
	return skillId;
}

public void setSkillId(long skillId) {
	this.skillId = skillId;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getProgress() {
	return progress;
}

public void setProgress(int progress) {
	this.progress = progress;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public String getStartDate() {
	return startDate;
}

public void setStartDate(String startDate) {
	this.startDate = startDate;
}

public String getEndDate() {
	return endDate;
}

public void setEndDate(String endDate) {
	this.endDate = endDate;
}

public String getStartTime() {
	return startTime;
}

public void setStartTime(String startTime) {
	this.startTime = startTime;
}

public String getEndTime() {
	return endTime;
}

public void setEndTime(String endTime) {
	this.endTime = endTime;
}

public String getAmountReceived() {
	return amountReceived;
}

public void setAmountReceived(String amountReceived) {
	this.amountReceived = amountReceived;
}

@Override
public String toString() {
	return "Trainings [id=" + id + ", userId=" + userId + ", mentorId=" + mentorId + ", skillId=" + skillId
			+ ", status=" + status + ", progress=" + progress + ", rating=" + rating + ", startDate=" + startDate
			+ ", endDate=" + endDate + ", startTime=" + startTime + ", endTime=" + endTime + ", amountReceived="
			+ amountReceived + "]";
}

}
