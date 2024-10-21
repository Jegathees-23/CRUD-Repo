package com.chainsys.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.main.Model.TaskAPIModel;
import com.chainsys.main.Model.UserAPIModel;
import com.chainsys.main.Service.UserAPIService;

@RestController
@RequestMapping("/api/user")
public class UserAPIController {
	
	@Autowired
	private UserAPIService serv;
	
	@PostMapping("/saveUser")
	public UserAPIModel saveUserDetails (@RequestBody UserAPIModel mod) {
		return serv.insertUserDetails(mod);
	}
	
	@PostMapping("/assignTask")
	public TaskAPIModel assignTask (@RequestBody TaskAPIModel mod) {
		return serv.assignTaskToUser(mod);
	}
	
	@GetMapping("/getUserDetails")
	public List<UserAPIModel> getUserDetails(
			@RequestParam(required = false) String usrName,
			@RequestParam(required = false) String deptName,
			@RequestParam(defaultValue = "a.name") String sortField,
			@RequestParam(defaultValue = "asc") String sortDirec) {
		
		return serv.fetchUserDetails(usrName,deptName,sortField,sortDirec);
	}
	
}
