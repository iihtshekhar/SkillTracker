package com.skilltracker.controller;


import java.util.List;
import javax.validation.Valid;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.skilltracker.dtos.SkillTrackerDTO;
import com.skilltracker.services.SkillTrackerService;



@RestController
@CrossOrigin
@RequestMapping("/skill-tracker")
public class SkillTrackerController {

	@SuppressWarnings("unused")
	@Autowired
	private SkillTrackerService SkillTrackerService;
	
	
	@PostMapping(value = "/addSkill")
	public ResponseEntity<SkillTrackerDTO> addSkill(@RequestBody @Valid SkillTrackerDTO addSkill,
																BindingResult result) {
		return null;
	}
	
	
	
	@GetMapping(value = "/viewAllSkill")
	public ResponseEntity<List<SkillTrackerDTO>> viewAllSkill() {
		return null;
		
	}
	
	@DeleteMapping(value = "/deleteSkill/{skillTrackerId}")
	public  ResponseEntity<SkillTrackerDTO> deleteSkill(@PathParam("skillTrackerId") String SkillTrackerId){
		return null;
	}
	
	@PutMapping(value = "/updateSkill")
	public  ResponseEntity<SkillTrackerDTO> updateSkill(@Valid @RequestBody SkillTrackerDTO skillTrackerDTO,
																	BindingResult result){
		return null;
	}

}