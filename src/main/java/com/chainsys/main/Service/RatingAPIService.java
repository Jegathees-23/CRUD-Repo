package com.chainsys.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.main.DTO.RatingDetailsDTO;
import com.chainsys.main.JPARepository.RatingAPIRepo;
import com.chainsys.main.JPARepository.RatingUserRepo;
import com.chainsys.main.Model.RatingModel;
import com.chainsys.main.Model.UserModel;

import jakarta.transaction.Transactional;

@Service
public class RatingAPIService {

	@Autowired
	private RatingUserRepo repo;
	
	@Autowired
	private RatingAPIRepo ratingRepo;
	
	public UserModel insertUserInfo(UserModel usr) {
		
		return repo.save(usr);
	}
	
	@Transactional
	public RatingModel insertRatingAgainstUser(RatingModel rating) {
		RatingModel rat = null;
		List<RatingModel> allRat = null;
		UserModel usrData = null;
		Double avgRat = 0.0;
		
		try {
			rat = ratingRepo.save(rating);
			if (rat != null) {
				allRat = ratingRepo.fetchRatingDtlsAgainstUser(rating.getUsr().getUserId());
				avgRat = allRat.stream().mapToDouble(RatingModel::getRating).average().orElse(0.0);
				usrData = repo.findById(rating.getUsr().getUserId()).orElseThrow(()-> new RuntimeException("User not found against this Id"));
				usrData.setAvgRating(avgRat);
				repo.save(usrData);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rat;
	}

}
