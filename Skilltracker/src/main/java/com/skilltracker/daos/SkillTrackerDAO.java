package com.skilltracker.daos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skilltracker.entitys.SkillTracker;

@Repository
public interface SkillTrackerDAO extends CrudRepository<SkillTracker, String>{
	
}
