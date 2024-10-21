package com.chainsys.main.JPARepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.main.Model.UserModel;

@Repository   
public interface RatingUserRepo extends JpaRepository<UserModel, Integer> {

}
