package com.chainsys.main.JPARepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.main.Model.DepartmentAPIModel;

@Repository
public interface DepartmentAPIRepo extends JpaRepository<DepartmentAPIModel, Long> {

}