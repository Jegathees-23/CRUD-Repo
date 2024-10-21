package com.chainsys.main.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.main.JPARepository.CommentRepo;
import com.chainsys.main.Model.CommentModel;

import jakarta.transaction.Transactional;

@Service
public class CommentService {

	@Autowired
	private CommentRepo repo;
	
	@Transactional
	public CommentModel insertComments(CommentModel mod, int parentId) {
		
		if (parentId != 0) {
			
			CommentModel prntCmnt = repo.findById(parentId).orElseThrow(()-> new RuntimeException("Parent Details Not Found"));
			
			if (prntCmnt.getStatus().equals(CommentModel.Status.DELETED)) {
				throw new RuntimeException("Parent Status is not in Active state");
				
			}
			mod.setParent(prntCmnt);
		} 
		return repo.save(mod);
	}

}
