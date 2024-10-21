package com.chainsys.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.main.Model.EmployeeAPIModel;
import com.chainsys.main.Service.EmployeeAPIService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeAPIController {

	@Autowired
    private EmployeeAPIService employeeService;

    @GetMapping
    public Page<EmployeeAPIModel> getEmployees(
            @RequestParam(required = false) Long departmentId,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "ASC") String sortOrder,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
    	Page pg = employeeService.getEmployees(departmentId, sortBy, sortOrder, page, size);
        return pg;
    }

    @PostMapping
    public EmployeeAPIModel createEmployee(@RequestBody EmployeeAPIModel employee) {
        
    	return employeeService.saveEmployee(employee);
    }
}
