package com.skilltracker.entitys;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("skilltracker")
@Data
public class SkillTracker {

	@Id
	private String skillId;
	private String skillName;
	private long skillMinVal;
	private long skillMaxVal;
	private long skillBegainMinVal;
	private long skillBegainMaxVal;
	private long skillIntermedMinVal;
	private long skillIntermedMaxVal;
	private long skillExpertMinVal;
	private String teamName;
	private String remarks;
	private String skillcategory;
	private String skilltype;
	private String skilltotExp;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
	private User user;

}