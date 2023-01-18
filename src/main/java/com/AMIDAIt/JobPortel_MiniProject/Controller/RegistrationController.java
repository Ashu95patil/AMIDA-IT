package com.AMIDAIt.JobPortel_MiniProject.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.AMIDAIt.JobPortel_MiniProject.Constant.AppConstant;
import com.AMIDAIt.JobPortel_MiniProject.Entity.User;
import com.AMIDAIt.JobPortel_MiniProject.Props.AppProps;
import com.AMIDAIt.JobPortel_MiniProject.Service.ServiceI;

@Controller
public class RegistrationController {
	
	@Autowired
	private ServiceI serviceI;
	
	@Autowired
	private AppProps appprops;
	
	@PostMapping("/saveUser")
	public String saveUserReisteration(User u,Model model) {
		
		boolean saveUseRegistration = serviceI.SaveUseRegistration(u);
		
		Map<String, String> messages = appprops.getMesseges();
		
		if(saveUseRegistration) {
			model.addAttribute(AppConstant.SUCCESS, messages.get(AppConstant.SAVE_SUCCESS));
		}else {
			model.addAttribute(AppConstant.SUCCESS, messages.get(AppConstant.SAVE_FAIL));

		}
		
		
		return AppConstant.REGISTRATION;
		
	}

}
