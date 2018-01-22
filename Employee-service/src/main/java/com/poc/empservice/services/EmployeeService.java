package com.poc.empservice.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.poc.empservice.model.Employee;

@Service
public class EmployeeService {

	private static final Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	static {

		empMap.put(1, new Employee("id1", "emp1", "manager"));
		empMap.put(2, new Employee("id2", "emp2", "engineer"));
		empMap.put(3, new Employee("id3", "emp3", "productonwer"));
		empMap.put(4, new Employee("id4", "emp4", "senior engineer"));
		empMap.put(5, new Employee("id5", "emp5", "developer"));
	}
	
	public List<Employee> getAllList() {
		List<Employee> emp = new ArrayList<>();
		emp.addAll(empMap.values());
		return emp;
	}

	public Employee getRecord(int id) {
		if (empMap.containsKey(id)) {
			return empMap.get(id);
		} else {
			throw new RuntimeException("no record");
		}
	}

}
