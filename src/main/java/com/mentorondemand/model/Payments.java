package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="payments")
public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "training_id")
	private long trainingId;
	
	@Column(name = "mentor_id")
	private long mentorId;

	@Column(name = "transaction_type")
	private String transactionType;
	
	@Column(name = "skill_name")
	private String skillName;

	@Column(name = "amount")
	private float amount;
	
	@Column(name = "total_amount_to_mentor")
	private float totalAmountToMentor;

	@Column(name = "date_time")
	private String dateTime;
	
	@Column(name = "remarks")
	private String remarks;
	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payments(long trainingId, long mentorId, String transactionType, String skillName, float amount,
			float totalAmountToMentor, String dateTime, String remarks) {
		super();
		this.trainingId = trainingId;
		this.mentorId = mentorId;
		this.transactionType = transactionType;
		this.skillName = skillName;
		this.amount = amount;
		this.totalAmountToMentor = totalAmountToMentor;
		this.dateTime = dateTime;
		this.remarks = remarks;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}
	public long getMentorId() {
		return mentorId;
	}
	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}
	public void setTotalAmountToMentor(float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}