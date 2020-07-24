package com.skilltracker.daos;

import org.springframework.data.repository.CrudRepository;

import com.skilltracker.entitys.Team;

public interface TeamDAO extends CrudRepository<Team, String> {

}
