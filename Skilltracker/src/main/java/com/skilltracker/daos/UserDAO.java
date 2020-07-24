package com.skilltracker.daos;

import org.springframework.data.repository.CrudRepository;


import com.skilltracker.entitys.User;

public interface UserDAO extends CrudRepository<User, String>{

}
