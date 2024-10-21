package com.chainsys.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.main.Exception.RecordNotFound;
import com.chainsys.main.JPARepository.UserRegistrationRepo;
import com.chainsys.main.Model.UserRegistrationModel;

@Service
public class UserRegistrationService {

	@Autowired
	UserRegistrationRepo usrRepo;
	
	public UserRegistrationModel saveUsers(UserRegistrationModel usrMod) {
		
		
		return this.usrRepo.save(usrMod);
	}
	
	public List<UserRegistrationModel> getAllUserList() {
		
		return this.usrRepo.findAll();
	}
	
	public Optional<UserRegistrationModel> getUsersById(Integer id) {
		
		return this.usrRepo.findById(id);
	}

	public UserRegistrationModel updateUserRecords(Integer id, UserRegistrationModel usrMdl) {
		
		UserRegistrationModel old = this.usrRepo.findById(id)
				.orElseThrow(()-> new RecordNotFound("User Details are Not in DB"));
		
		old.setUserName(usrMdl.getUserName());
		old.setPassword(usrMdl.getPassword());
		old.setMobNum(usrMdl.getMobNum());
		old.setEmailId(usrMdl.getEmailId());
		
		return this.usrRepo.save(old);
	}

	public String deleteUserRecords(Integer id) {
		
		this.usrRepo.findById(id).orElseThrow(()-> new RecordNotFound("User Details Not Found"));
		this.usrRepo.deleteById(id);
		return "Record Deleted Succesfully";
	}
}
