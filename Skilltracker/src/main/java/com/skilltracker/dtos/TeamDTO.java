package com.skilltracker.dtos;


import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import lombok.Data;

public class TeamDTO {
	
@SuppressWarnings("unused")
private String teamId;
    
	@Length(min = 5, max = 30)
	@NotNull
	private String teamName;

	@Length(min = 3, max = 25)
	@NotNull
	private long teamDomain;



}
