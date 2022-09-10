package model.service;

import java.util.ArrayList;
import java.util.List;

import model.vo.Employee;

public class EmployeeService {

	
	
	private List<Employee> empList = new ArrayList<Employee>();
	
	public EmployeeService() {
		empList.add(new Employee(1, "김정현", "950310-1234567", "jhyeon310@naver.com", "010-9874-9078", "대표", "대표", 1000000000));
		empList.add(new Employee(2, "이순신", "850522-2543154", "dltnstls@naver.com",  "010-3221-7890", "마케팅", "팀장", 5000000));
		empList.add(new Employee(3, "홍길동", "800317-1122334", "rlfehd@daum.net",  "010-2864-9753", "총무", "차장", 4000000));
		empList.add(new Employee(4, "장영실", "900931-2654321", "jang@google.com", "010-5855-6106", "회계", "주임", 3000000));
		empList.add(new Employee(5, "배고파", "950224-1678423", "hungry@ramen.com", "010-5821-1992", "마케팅", "사원", 2000000));
	}
	
	
	
	/** 1. 새로운 사원 정보 추가
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return
	 */
	public boolean addEmployee(int empId, String empName, String empNo, String email, String phone,
			String departmentTitle, String jobName, int salary) {

		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		
		return empList.add(emp);
	}
	


	/** 2. 전체 사원 정보 조회
	 * @return empList
	 */
	public List<Employee> getEmpList() {
		
		
		
		return empList;
	}



	/** 3. 사번이 일치하는 사원 정보 조회
	 * @param num
	 * @return resultList
	 */
	public List<Employee> selectEmployee(int num) {

		List<Employee> resultList = new ArrayList<>();
		
		for(Employee e : empList) {
			
			if(e.getEmpId() == num) {
				resultList.add(e);
			}
		}
		
		return resultList;
	}



	/** 4. 사번이 일치하는 사원 정보 수정
	 * @param num
	 * @param email
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return 입력한 사원번호 있으면 수정후 true, 없으면 false
	 */
	public boolean updateEmployee(int num, String email, String departmentTitle, String jobName, int salary) {
		Employee emp = null;
		
		for(Employee e : empList) {
		
			if(num == e.getEmpId()) {
				
				e.setEmail(email);
				e.setDepartmentTitle(departmentTitle);
				e.setJobName(jobName);
				e.setSalary(salary);
				return true;
				
			} 
			
		}
		
		return false;
		
	}



		



	

	

}
