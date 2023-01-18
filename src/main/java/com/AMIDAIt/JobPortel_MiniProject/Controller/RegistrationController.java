package com.AMIDAIt.JobPortel_MiniProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AMIDAIt.JobPortel_MiniProject.Constant.AppConstant;
import com.AMIDAIt.JobPortel_MiniProject.Entity.User;
import com.AMIDAIt.JobPortel_MiniProject.Props.AppProps;
import com.AMIDAIt.JobPortel_MiniProject.Service.ServiceI;

@Controller
public class RegistrationController {
	
	
	@Autowired
	private ServiceI serviceI;
	
	
	@Autowired
	private AppProps appProps;
	
	@GetMapping("/index")
	public String IndexPage(Model model) {
		
		User user= new User();
		
	model.addAttribute("user",user );
		
		
		return "Index";
		
		
	}
	
	
	
	
	@PostMapping("/saveuser")
	 public String saveUser(@RequestBody User u,Model model){
		
		 boolean saveUseRegistration = serviceI.SaveUseRegistration(u);
		
		if(saveUseRegistration) {
			return "Registration";
		}else {
		return null;
		 
	 }

	}

}