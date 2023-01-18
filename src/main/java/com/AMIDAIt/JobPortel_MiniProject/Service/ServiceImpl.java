package com.AMIDAIt.JobPortel_MiniProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AMIDAIt.JobPortel_MiniProject.Entity.User;
import com.AMIDAIt.JobPortel_MiniProject.Repository.UserRepository;

@Service
public class ServiceImpl implements ServiceI {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean SaveUseRegistration(User u) {
		
		 User save = this.userRepository.save(u);
		if(save != null && save.getUserid()!=null) {
			return true;
		}else {
		return false;
	}

}
}