package com.chainsys.main.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TaskAPIModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String taskName;
	
	@ManyToOne
	@JoinColumn(name="userAssignmentId",nullable = false)
	private UserAPIModel users;
	
	@ManyToOne
	@JoinColumn(name="userAssignmentById",nullable = false)
	private UserAPIModel users1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public UserAPIModel getUsers() {
		return users;
	}

	public void setUsers(UserAPIModel users) {
		this.users = users;
	}

	public UserAPIModel getUsers1() {
		return users1;
	}

	public void setUsers1(UserAPIModel users1) {
		this.users1 = users1;
	}
	
}
