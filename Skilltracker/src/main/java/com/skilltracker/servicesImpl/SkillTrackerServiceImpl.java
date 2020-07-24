package com.skilltracker.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilltracker.daos.SkillTrackerDAO;
import com.skilltracker.dtos.SkillTrackerDTO;
import com.skilltracker.services.SkillTrackerService;

@Service
public class SkillTrackerServiceImpl implements SkillTrackerService {

	@Autowired
	private SkillTrackerDAO skillTrackerDAO;

	@Override
	public List<SkillTrackerDTO> getAllSkill() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SkillTrackerDTO saveSkill(SkillTrackerDTO SkillTrackerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SkillTrackerDTO deleteSkill(String skillId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SkillTrackerDTO updateSkill(SkillTrackerDTO SkillTrackerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
