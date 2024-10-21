package com.chainsys.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.chainsys.main.JPARepository.TaskAPIRepository;
import com.chainsys.main.JPARepository.UserAPIRepository;
import com.chainsys.main.Model.TaskAPIModel;
import com.chainsys.main.Model.UserAPIModel;

@Service
public class UserAPIService {

	@Autowired
	private UserAPIRepository repo;
	
	@Autowired
	private TaskAPIRepository repo1;
	
	public UserAPIModel insertUserDetails(UserAPIModel mod) {
		
		return repo.save(mod);
	}

	public TaskAPIModel assignTaskToUser(TaskAPIModel mod) {
		
		return repo1.save(mod);
	}

	public List<UserAPIModel> fetchUserDetails(String usrName, String deptName, String sortField, String sortDirec) {
		Sort sort = Sort.by(Sort.Direction.fromString(sortDirec),sortField);
		
		
		if (usrName != null && deptName != null) {
			return repo.findByNameContainingIgnoreCaseAndDepartment_DepartmentNameContainingIgnoreCase(
					usrName,deptName,sortDirec,sortField);
			
		} else if (usrName != null) {
			return repo.findByNameContainingIgnoreCase(usrName,sortDirec,sortField);
			
		} else if (deptName != null) {
			return repo.findByDepartment_DepartmentNameContainingIgnoreCase(deptName,sortDirec,sortField);
		
		} else {
			return repo.findAll(sort);
		}	
	}

}
