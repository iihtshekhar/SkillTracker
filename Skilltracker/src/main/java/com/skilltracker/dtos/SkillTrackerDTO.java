package com.skilltracker.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import lombok.Data;

@SuppressWarnings("deprecation")
@Data
public class SkillTrackerDTO {


    private String skillId;
    
	@Length(min = 5, max = 30)
	@NotNull
	private String skillName;

	@Length(min = 3, max = 25)
	@NotNull
	private long skillMinVal;

	@Length(min = 3, max = 25)
	private long skillMaxVal;

	@Length(min = 3, max = 25)
	private long skillBegainMinVal;

	@NotNull
	@Min(0L)
	private long skillBegainMaxVal;
	
	@NotNull
	@Length(min = 10, max = 10)
	private long skillIntermedMinVal ;
	
	@NotNull
	private long skillIntermedMaxVal;
	
	@NotNull
	@Length(min = 10, max = 10)
	private long skillExpertMinVal;
	
	@NotNull
	@Length(min = 10, max = 10)
	private long skillExpertMaxVal;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String teamName;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String remarks;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String skillcategory;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String skilltype;
	
	@NotNull
	@Length(min = 10, max = 10)
	private String skilltotExp;
	
}
