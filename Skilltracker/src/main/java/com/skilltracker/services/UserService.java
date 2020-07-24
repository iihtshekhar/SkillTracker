package com.skilltracker.services;

import java.util.List;


import com.skilltracker.dtos.UserDTO;

public interface UserService {
	
	public List<UserDTO> getAllUser();

	public UserDTO saveUser(UserDTO UserDTO);
	
	public UserDTO deleteUser(String userId);
	
	public UserDTO updateUser(UserDTO UserDTO);
	
	public UserDTO getUserByFirstName(UserDTO userfName );
	
	public UserDTO getUserByEmail(UserDTO userEmail);
	
	


}
