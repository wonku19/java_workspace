package com.kh.example.practice5;

import java.util.Scanner;

import com.kh.example.practice5.model.Employee;
import com.kh.example.practice5.controller.EmployeeController;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	Employee viewEmployee = new Employee();
	EmployeeController employeeController = new EmployeeController();
	
	public static void main(String[] args) {
		
		Application app = new Application();
	
		boolean check = true;
		while(check) {
			int select = app.employeeMenu();
			switch(select) {
			case 1:
				app.insertEmp();
				break;
			case 2:
				app.updateEmp();
				break;
			case 3:
				app.printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				check = false;
				break;
			}
		}
	}
		
	public int employeeMenu() { // 메인메뉴 출력 메소드
		
		System.out.println("1. 사원 정보 추가");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호를 누르세요 : ");		
		return Integer.parseInt(sc.nextLine());
		
	} 
	
	public void insertEmp() { // 저장데이터를 사용자에게 받는 메서드
		
		System.out.print("사원 번호 : ");
		int empNo = Integer.parseInt(sc.nextLine());
		
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		String add = sc.nextLine();
		
		if (add.equals("y")) { 
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
			System.out.print("사원 연봉 : ");
			int salary = Integer.parseInt(sc.nextLine());
			
			System.out.print("보너스 율 : ");
			double bonus = Double.parseDouble(sc.nextLine());
			
			employeeController.add(empNo, name, gender, phone, dept, salary, bonus);
			
		} else {
			employeeController.add(empNo, name, gender, phone);
		}
	}
	
	public void updateEmp() { // 수정할 데이터를 사용자에게 받는 메서드
		
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");	
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int select = Integer.parseInt(sc.nextLine());
		
		switch(select) {
		case 1:
			System.out.print("전화 번호 입력 : ");
			String phone = sc.nextLine();
			employeeController.modify(phone);
			break;
		case 2:
			System.out.print("사원 연봉 입력 : ");
			int salary = Integer.parseInt(sc.nextLine());
			employeeController.modify(salary);
			break;
		case 3:
			System.out.print("보너스 율 입력 : ");
			double bonus = Double.parseDouble(sc.nextLine());
			employeeController.modify(bonus);
			break;
		case 9:
			break;
		}
	}
	
	public void printEmp() { // 데이터를 출력하는 메서드
		System.out.println(employeeController.info());
	}
	
}

/* [초기 출력]
 * 1. 사원 정보 추가
 * 2. 사원 정보 수정
 * 3. 사원 정보 출력
 * 9. 프로그램 종료
 * 메뉴 번호를 누르세요 : (입력값)
 * 
 * ▶ 1을 눌렀을때
 * 사원 번호 : (입력값)
 * 사원 이름 : (입력값)
 * 사원 성별 : (입력값)
 * 전화 번호 : (입력값)
 * 추가 정보를 더 입력하시겠습니까?(y/n) : (입력값)
 * 사원 부서 : (입력값)
 * 사원 연봉 : (입력값)
 * 보너스 율 : (입력값) 
 * 다시 [초기출력] 재출력
 * 
 * ▶ 2를 눌렀을때
 * 사원의 어떤 정보를 수정하시겠습니까?
 * 1. 전화 번호
 * 2. 사원 연봉
 * 3. 보너스 율
 * 9. 돌아가기
 * 메뉴 번호를 누르세요 : (입력값)
 * 
 * ▶ 2에서 1을 눌렀을때
 * 전화 번호 입력 : (입력값)
 * 다시 [초기출력] 재출력
 * 
 * ▶ 2에서 2를 눌렀을때
 * 사원 연봉 입력 : (입력값)
 * 다시 [초기출력] 재출력
 * 
 * ▶ 2에서 3을 눌렀을때
 * 보너스 율 입력 : (입력값)
 * 다시 [초기출력] 재출력
 * 
 * ▶ 3을 눌렀을때
 * Employee [empNo=1, name=홍길동....bonus=0.23]
 * 
 * ▶ 9를 눌렀을때
 * 프로그램을 종료합니다.
 */
 