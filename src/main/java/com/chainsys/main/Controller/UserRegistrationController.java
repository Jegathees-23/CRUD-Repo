package com.chainsys.main.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.main.Model.UserRegistrationModel;
import com.chainsys.main.Service.UserRegistrationService;

@RestController
@RequestMapping("/user")
public class UserRegistrationController {
	
	@Autowired
	UserRegistrationService usrServ;
	
	
	@PostMapping("/RegisterUser")
	public UserRegistrationModel addUser(@RequestBody UserRegistrationModel usrMod) {
		
		return this.usrServ.saveUsers(usrMod);
	}
	
	@GetMapping("FetchUserRecords")
	public List<UserRegistrationModel> fetchUserRecords() {
		
		return this.usrServ.getAllUserList();
	}
	
	@GetMapping("FetchUserRecordsById/{id}")
	public Optional<UserRegistrationModel> getUserRecordeById(@PathVariable (value="id") Integer id) {
		
		return this.usrServ.getUsersById(id);
	}
	
	@PutMapping("UpdateRecords/{id}")
	public UserRegistrationModel updateReocrds(@PathVariable(value="id") Integer id,
			@RequestBody UserRegistrationModel usrMdl) {
		
		return this.usrServ.updateUserRecords(id,usrMdl);
	}
	
	@DeleteMapping("/DeleteRecord/{id}")
	public String deletRecord(@PathVariable(value="id") Integer id) {
		
		return this.usrServ.deleteUserRecords(id);
	}
}
