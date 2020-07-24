package com.skilltracker.services;

import java.util.List;


import com.skilltracker.dtos.TeamDTO;

public interface TeamService {
	
	public List<TeamDTO> getAllTeam();

	public TeamDTO saveTeam(TeamDTO TeamDTO);
	
	public TeamDTO deleteTeam(String teamId);
	
	public TeamDTO updateTeam(TeamDTO TeamDTO);

}
