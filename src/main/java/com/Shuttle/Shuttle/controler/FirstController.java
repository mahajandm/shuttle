package com.Shuttle.Shuttle.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Shuttle.Shuttle.entity.UserEntity;
import com.Shuttle.Shuttle.service.UserService;
import com.Shuttle.Shuttle.utility.MappingUtility;

@RestController
public class FirstController {

	@Autowired
	private UserService userService;

	@Autowired
	private MappingUtility mappingUtility;

	public UserEntity user = new UserEntity();

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	private ModelAndView loginMethod(@RequestBody MultiValueMap<String, String> paramMap) {
		// TODO Auto-generated method stub
		String result = null;
		this.user = mappingUtility.loginMapping(paramMap);
		result = userService.loginServiceMethod(this.user);
		System.out.println("Hello");
		ModelAndView model = new ModelAndView();
		if (result != null) {
			model.addObject("message", result);
			model.setViewName("homepage");
		} else {
			model.addObject("message", "wrong username and password");
			model.setViewName("Error");
		}
		return model;
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	private String signupMethod(@RequestBody MultiValueMap<String, String> paramMap) {
		// TODO Auto-generated method stub
		this.user = mappingUtility.signupMapping(paramMap);
		userService.signupServiceMethod(this.user);
		System.out.println("Hello  " + paramMap);
		return "Bhoop";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	private ModelAndView aboutPage() {
		// TODO Auto-generated method stub
		ModelAndView model = new ModelAndView();
		model.addObject("message", "About page");
		model.setViewName("homepage");
		return model;
	}
}
