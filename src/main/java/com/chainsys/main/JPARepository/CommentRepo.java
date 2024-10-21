package com.chainsys.main.JPARepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.main.Model.CommentModel;

@Repository
public interface CommentRepo extends JpaRepository<CommentModel, Integer> {

}
