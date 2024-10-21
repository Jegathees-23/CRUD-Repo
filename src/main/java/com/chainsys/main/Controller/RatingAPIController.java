package com.chainsys.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.main.Model.RatingModel;
import com.chainsys.main.Model.UserModel;
import com.chainsys.main.Service.RatingAPIService;

@RestController
@RequestMapping("/api/rating")
public class RatingAPIController {

	@Autowired
	private RatingAPIService serv;
	
	@PostMapping("/saveUserDetails")
	public UserModel saveUsers(@RequestBody UserModel usr) {
		
		return serv.insertUserInfo(usr);
	}
	
	@PostMapping("/saveAndUpdateRatings")
	public RatingModel saveRatings (@RequestBody RatingModel rating) {
		
		return serv.insertRatingAgainstUser(rating);
	}
}
