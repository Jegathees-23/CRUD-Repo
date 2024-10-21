package com.chainsys.main.JPARepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.main.Model.UserRegistrationModel;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistrationModel,Integer> {

	// Explicitely writing qry
	
	
	
	
//	  @Query(value="SELECT new com.chainsys.main.DTO.UserRegistrationDTO(A.A,B.B) FROM DEMO1 A, DEMO2 B WHERE A.ID1 = B. ID2 AND A.UID = ?1"
//	  ,nativeQuery = true) 
//	  public List<UserRegistrationDTO> getRecords(int id);
	 
}

