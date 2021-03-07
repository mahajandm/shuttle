package com.Shuttle.Shuttle.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.Shuttle.Shuttle.entity.UserEntity;
@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {

	public UserEntity findByEmailAndPassword(String email,String password);
	public UserEntity findByMobileAndPassword(String mobile,String password);

}
