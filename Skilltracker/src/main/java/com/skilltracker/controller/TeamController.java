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
import com.skilltracker.dtos.TeamDTO;
import com.skilltracker.services.UserService;

@RestController
@CrossOrigin
@RequestMapping("/team")
public class TeamController {


		@SuppressWarnings("unused")
		@Autowired
		private UserService UserService;

		@PostMapping(value = "/addTeam")
		public ResponseEntity<TeamDTO> addTeam(@RequestBody @Valid TeamDTO addTeam, BindingResult result) {
			return null;
		}

		@GetMapping(value = "/viewAllTeam")
		public ResponseEntity<List<TeamDTO>> viewAllTeam() {
			return null;

		}

		@DeleteMapping(value = "/deleteTeam/{teamId}")
		public ResponseEntity<TeamDTO> deleteTeam(@PathParam("teamId") String TeamId) {
			return null;
		}

		@PutMapping(value = "/updateTeam")
		public ResponseEntity<TeamDTO> updateTeam(@Valid @RequestBody TeamDTO TeamDTO, BindingResult result) {
			return null;
		}
		
		

	}

