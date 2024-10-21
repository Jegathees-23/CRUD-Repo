package com.chainsys.main.JPARepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.main.Model.EmployeeAPIModel;

@Repository
public interface EmployeeAPIRepo extends JpaRepository<EmployeeAPIModel, Long> {
	
	Page<EmployeeAPIModel> findAllByDepartmentId(Long departmentId, Pageable pageable);
}
