package model.service;

import java.util.ArrayList;
import java.util.List;

import model.vo.Employee;

public class EmployeeService {

	
	
	private List<Employee> empList = new ArrayList<Employee>();
	
	public boolean addEmployee(int empId, String empName, String empNo, String email, String phone,
			String departmentTitle, String jobName, int salary) {

		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		
		return empList.add(emp);
	}
	


	public List<Employee> getEmpList() {
		
		
		
		return empList;
	}


//	public List<Employee> selectEmployee(int num) {
//		
//		List<Employee> resultList = new ArrayList<Employee>();
//		
//		for(Employee e : empList) {
//			
//			if(e.getEmpId() == num) {
//				resultList.add(e);
//			}
//			
//			
//		}
//		
//		return resultList;
//	}


	

	

}
