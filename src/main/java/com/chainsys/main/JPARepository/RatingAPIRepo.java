package com.chainsys.main.JPARepository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.chainsys.main.DTO.RatingDetailsDTO;
import com.chainsys.main.Model.RatingModel;

@Repository
public interface RatingAPIRepo extends JpaRepository<RatingModel, Integer> {

	@Query(value=" SELECT RATING_ID,CREATED_AT,RATING,UPDATED_AT,USER_ID "
			+ "FROM RATING_MODEL WHERE USER_ID = ?",nativeQuery = true)
	public List<RatingModel> fetchRatingDtlsAgainstUser(int usrId);
}
