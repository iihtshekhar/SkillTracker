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
import com.skilltracker.dtos.UserDTO;
import com.skilltracker.services.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	


		@SuppressWarnings("unused")
		@Autowired
		private UserService UserService;
		
		
		@PostMapping(value = "/addUser")
		public ResponseEntity<UserDTO> addSkill(@RequestBody @Valid UserDTO addUser,
																	BindingResult result) {
			return null;
		}
		
		
		
		@GetMapping(value = "/viewAllUser")
		public ResponseEntity<List<UserDTO>> viewAllUser() {
			return null;
			
		}
		
		@DeleteMapping(value = "/deleteUser/{userId}")
		public  ResponseEntity<UserDTO> deleteSkill(@PathParam("userId") String UserId){
			return null;
		}
		
		@PutMapping(value = "/updateUser")
		public  ResponseEntity<UserDTO> updateUser(@Valid @RequestBody UserDTO UserDTO,
																		BindingResult result){
			return null;
		}
		
		
		@PutMapping(value = "/getUserByFirstName")
		public  ResponseEntity<UserDTO> getUserByFirstName(@Valid @RequestBody UserDTO UserDTO,
																		BindingResult result){
			return null;
		}
		
		
		@PutMapping(value = "/getUserByEmail")
		public  ResponseEntity<UserDTO> getUserByEmail(@Valid @RequestBody UserDTO UserDTO,
																		BindingResult result){
			return null;
		}

}

