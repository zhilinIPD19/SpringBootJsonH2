package com.zlin.jsondb.repository;

import org.springframework.data.repository.CrudRepository;

import com.zlin.jsondb.domain.User;

public interface UserRepository  extends CrudRepository<User,Long>{
	

}
