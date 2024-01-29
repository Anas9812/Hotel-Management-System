package newspringproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import newspringproject.models.user;
import newspringproject.service.MyuserService;



@RestController
public class userController {

	@Autowired
	MyuserService userservice;
	
	
	@PostMapping("/register")
	public String register (@RequestBody user u){
	userservice.saveuser(u);
		return "Register Successfully";
	}
	
}
