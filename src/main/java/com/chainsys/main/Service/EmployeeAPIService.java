package com.chainsys.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.chainsys.main.JPARepository.EmployeeAPIRepo;
import com.chainsys.main.Model.EmployeeAPIModel;

@Service
public class EmployeeAPIService {

	@Autowired
    private EmployeeAPIRepo employeeRepository;

    public Page<EmployeeAPIModel> getEmployees(Long departmentId, String sortBy, String sortOrder, int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.fromString(sortOrder), sortBy);
        if (departmentId != null) {
            return employeeRepository.findAllByDepartmentId(departmentId, pageable);
        } else {
            return employeeRepository.findAll(pageable);
        }
    }

    public EmployeeAPIModel saveEmployee(EmployeeAPIModel employee) {
        return employeeRepository.save(employee);
    }
}
