package com.skilltracker.services;

import java.util.List;

import com.skilltracker.dtos.SkillTrackerDTO;





public interface SkillTrackerService {
    
	public List<SkillTrackerDTO> getAllSkill();

	public SkillTrackerDTO saveSkill(SkillTrackerDTO SkillTrackerDTO);
	
	public SkillTrackerDTO deleteSkill(String skillId);
	
	public SkillTrackerDTO updateSkill(SkillTrackerDTO SkillTrackerDTO);
	
	
	
}
