package com.chainsys.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.main.DTO.CommentRequest;
import com.chainsys.main.Model.CommentModel;
import com.chainsys.main.Service.CommentService;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

	@Autowired
	private CommentService serv;
	
	@PostMapping("/savecomments")
	public ResponseEntity<CommentModel> saveComments(@RequestBody CommentRequest req) {
		
		CommentModel mod = new CommentModel();
		mod.setContent(req.getContent());
		
		CommentModel savedComnt = serv.insertComments(mod,req.getParentId());
		
		return ResponseEntity.ok(savedComnt);
	}
}
