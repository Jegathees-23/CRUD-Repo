package com.chainsys.main.JPARepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.chainsys.main.Model.UserAPIModel;

@Repository
public interface UserAPIRepository extends JpaRepository<UserAPIModel, Integer> {
	
	@Query(value = "SELECT * FROM USERAPIMODEL WHERE NAME = ? ORDER BY ?",nativeQuery = true)
	List<UserAPIModel> findByNameContainingIgnoreCase(String name, String field, String direc);
	
	@Query(value = "SELECT * FROM USERAPIMODEL A,DEPARTMENTAPIMODEL B"
			+ " WHERE A.DEPARTMENT_ID = B.ID AND B.NAME = ? ORDER BY ?",
			nativeQuery = true)
    List<UserAPIModel> findByDepartment_DepartmentNameContainingIgnoreCase(
    		String departmentName, String field, String direc);
    
	@Query(value = "SELECT * FROM USERAPIMODEL A,DEPARTMENTAPIMODEL B"
			+ " WHERE A.DEPARTMENT_ID = B.ID AND A.NAME = ? AND B.NAME = ? ORDER BY ?",
			nativeQuery = true)
    List<UserAPIModel> findByNameContainingIgnoreCaseAndDepartment_DepartmentNameContainingIgnoreCase(
    		String name,String deptName, String field, String direc);
}
