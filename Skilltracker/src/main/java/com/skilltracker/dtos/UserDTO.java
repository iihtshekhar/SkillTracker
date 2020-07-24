package com.skilltracker.dtos;

import javax.validation.constraints.Email;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import lombok.Data;

@SuppressWarnings("deprecation")
@Data
public class UserDTO {

	private String userId;

	@Length(min = 5, max = 30)
	@NotNull
	private String userfName;

	@Length(min = 3, max = 25)
	@NotNull
	private long userlName;

	@Email
	private long email;

}
