package com.Shuttle.Shuttle.utility;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.Shuttle.Shuttle.entity.UserEntity;

@Component
public class MappingUtility {
	

	public UserEntity loginMapping(MultiValueMap<String,String> paramMap)
	{
    UserEntity user=new UserEntity();
    if(paramMap.getFirst("email").contains("@"))
    	user.setEmail(paramMap.getFirst("email"));
    else
    	user.setMobile(paramMap.getFirst("email"));
	user.setPassword(paramMap.getFirst("password"));
	return user;
 }
	public UserEntity signupMapping(MultiValueMap<String,String> paramMap)
	{
    UserEntity user=new UserEntity();
	user.setUserName(paramMap.getFirst("user_name"));
	user.setPassword(paramMap.getFirst("password"));
	user.setEmail(paramMap.getFirst("email"));
	user.setMobile(paramMap.getFirst("mobile"));
	return user;
 }
}
