package com.AMIDAIt.JobPortel_MiniProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AMIDAIt.JobPortel_MiniProject.Entity.User;
import com.AMIDAIt.JobPortel_MiniProject.Service.ServiceI;

@RestController
public class UserController {
	
	
	@Autowired
	private ServiceI serviceI;
	
	@PostMapping("/saveuser")
	 public ResponseEntity<Boolean> saveUser(@RequestBody User u){
		
		 boolean saveUseRegistration = serviceI.SaveUseRegistration(u);
		
		if(saveUseRegistration) {
			return new ResponseEntity<Boolean>(saveUseRegistration,HttpStatus.CREATED);
		}else {
		return new ResponseEntity<Boolean>(saveUseRegistration,HttpStatus.BAD_REQUEST);
		 
	 }

	}
}
