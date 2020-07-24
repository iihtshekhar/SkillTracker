package com.skilltracker.entitys;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document("team")
@Data

public class Team {
	

	private String teamId;
	private String teamName;
	private String teamDomain;
	
}
