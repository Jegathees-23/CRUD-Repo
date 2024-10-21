package com.chainsys.main.JPARepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.main.Model.TaskAPIModel;

@Repository
public interface TaskAPIRepository extends JpaRepository<TaskAPIModel, Integer> {

}
