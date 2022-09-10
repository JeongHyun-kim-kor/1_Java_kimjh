package view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.service.EmployeeService;
import model.vo.Employee;

public class EmployeeView {

	EmployeeService service = new EmployeeService();
	Scanner sc = new Scanner(System.in);
	
	public void viewMenu() {
	
	int input = 0;
	
	do {
		System.out.println("========= 사원 관리 프로그램 ========\n");
		System.out.println("1. 새로운 사원 정보 추가");
		System.out.println("2. 전체 사원 정보 조회");
		System.out.println("3. 사번이 일치하는 사원 정보 조회");
		System.out.println("4. 사번이 일치하는 사원 정보 수정");
		System.out.println("5. 사번이 일치하는 사원 정보 삭제");
		System.out.println("6. 입력 받은 부서와 일치하는 모든 사원 정보 조회");
		System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
		System.out.println("8. 부서별 급여 합 전체 조회");
		System.out.println("0. 프로그램 종료");
	
		try {
	System.out.println();
		System.out.print("메뉴 선택 >> ");
		input = sc.nextInt();
		System.out.println();
		switch(input) {
		
		case 1 : addEmployee(); break;
		case 2 : selectAll(); break;
		case 3 : selectEmployee(); break;
		case 4 : updateEmployee();break;
//		case 5 : removeEmployee();break;
//		case 6 : departmentSelect();break;
//		case 7 : salarySelect();  break;
//		case 8 : departmentSalarySelect(); break;
		case 0 : System.out.println("프로그램 종료."); break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		}catch (InputMismatchException e ) {
			System.out.println("[Error] 입력형식이 올바르지 않습니다.");
			
			input = -1;
		}
	
	
	} while(input !=0);
	}
	
	
	public void addEmployee() {
		
		System.out.println("[새로운 사원 정보 추가]");
		System.out.print("사원 번호(사번) : ");
		int empId = sc.nextInt();
		sc.nextLine();
	System.out.print("사원 이름 : ");
		String empName = sc.nextLine();
		
	System.out.print("주민등록번호 : ");
		String empNo = sc.nextLine();
		
	System.out.print("이메일 : ");
		String email = sc.nextLine();
		
	System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
	System.out.print("부서명 : ");
		String departmentTitle = sc.nextLine();
		
	System.out.print("직급명 : ");
		String jobName = sc.nextLine();
		
	System.out.print("급여 : ");
	int salary = sc.nextInt();
	if(service.addEmployee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary)) {
		
		System.out.println("[추가 완료]");
		System.out.println();
		
	} else {
		System.out.println("추가 실패");
	}
	}

	public void selectAll() {
		
		List<Employee> empList = service.getEmpList();
		
		for(int i = 0 ; i <empList.size();i++) {
			System.out.println(empList.get(i));
		}
		
	}
	

	public void selectEmployee() {
		
		System.out.println("[사번과 일치하는 사원 정보 조회]");
		
		System.out.print("사번 입력 : ");
		int num = sc.nextInt();
		
		List<Employee> resultList = service.selectEmployee(num);	
		
		if(resultList.isEmpty()) {
			System.out.println("결과 X");
		} else {
			for(Employee e : resultList) {
				System.out.println(e);
			}
		}
	}


	/** 4. 사번이 일치하는 사원 정보 수정
	 * 
	 */
	public void  updateEmployee() {
		
		System.out.println("사번과 일치하는 사원 수정");
		
		System.out.print("수정할 사원의 사번 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("부서명 : ");
		String departmentTitle = sc.next();
		
		System.out.print("직급명 : ");
		String jobName = sc.next();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		if(service.updateEmployee(num, email, departmentTitle, jobName, salary)){
			System.out.println("사원번호" + num+ "수정 완료");
			
		} else {
			System.out.println("실패, 해당 사원 번호와 일치하는 사원 없습니다.");
		}
		
		
	}

	
	
	
	
	
	
	
}
	
	
	
	
	

