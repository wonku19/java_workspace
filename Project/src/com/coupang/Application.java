package com.coupang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.coupang.controller.SellerController;
import com.coupang.controller.UserController;
import com.coupang.model.Seller;
import com.coupang.model.User;

public class Application {
	
	private Scanner sc = new Scanner(System.in);
    private SellerController sec = new SellerController();
    private UserController usc = new UserController();
    HashMap selmap = sec.viewlist();
    HashMap usmap = usc.viewUserList();
    String gid;
	
	public static void main(String[] args) {
		Application app = new Application();
		app.main();
		
	}
	
	// 메인메뉴 9 누르기 전까지 무한반복
	public void main() {
		String id;
		boolean check = true;
		while(check) {
			System.out.println("===== 쿠팡 =====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("9. 종료");
			System.out.print("원하는 메뉴를 입력하세요 : ");
			
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				join();
				break;
			case 2:
				login();
				break;
			case 9:
				System.out.println("프로그렘 종료");
				check = false;
				break;
			}
		}
	}
	
	// main 에서 1을 눌러서 회원가입
	public void join() {
		
		System.out.print("사용할 ID : ");
		String id = sc.nextLine();
		System.out.print("사용자명 : ");
		String name = sc.nextLine();
		System.out.print("사용할 비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("배송지 : ");
		String address = sc.nextLine();
		System.out.print("연락처 : ");
		String number = sc.nextLine();
		
		if(usc.join(id, new User(id, name, password, address, number))) {
			System.out.println("회원가입 완료");
		} else {
			System.out.println("이미 사용중인 ID 입니다.");
		}
	}
	
	public void login() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		String name = usc.login(id, password);
		
		if(name != null) {
			System.out.println(name + "님 로그인 되었습니다.");
//			id 전역변수에 로그인 성공한 ID 세팅
			gid = id;
			System.out.println("로그인 성공 ID : " + gid);
			userMenu();
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
	}
	
	public void userMenu() {
		System.out.println("===== 사용자 메뉴 =====");
		System.out.println("1. 회원정보 수정");
		System.out.println("2. 회원 탈퇴");
		System.out.println("3. 물품 메뉴");
		System.out.println("9. 로그아웃");
		System.out.print("원하는 메뉴를 입력하세요 : ");
		
		switch(Integer.parseInt(sc.nextLine())) {
		case 1:
			changeUser();
			break;
		case 2:
			removeUser();
			break;
		case 3:
			sellMenu();
			break;
		case 9:
			gid = null;
			main();
			break;
		}
	}
	
	public void changeUser() {
			
		System.out.println("로그인 성공 ID : " + gid);
		System.out.print("비밀번호를 재입력 해주세요 : ");
		String password = sc.nextLine();
		
		String name = usc.login(gid, password);
		
		if(name != null) {			
			System.out.println("===== " + name + " 정보변경=====");
			System.out.println("1. 비밀번호 변경");
			System.out.println("2. 주소 변경");
			System.out.println("3. 연락처 변경");
			System.out.println("이전 메뉴로");
			System.out.print("원하는 메뉴를 입력하세요 : ");
			
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				passwordchange();
				break;
			case 2:
				addresschange();
				break;
			case 3:
				numberchange();
				break;
			case 9:
				userMenu();
				break;
			}
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}
	
	public void passwordchange() {
		
	}
	
	public void addresschange() {
		
	}
	
	public void numberchange() {
		
	}
	
	public void removeUser() {
		System.out.println("로그인 성공 ID : " + gid);
		System.out.println("회원삭제 메뉴입니다.");
		System.out.print("아이디를 재입력 해주세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 재입력 해주세요 : ");
		String password = sc.nextLine();

		String name = usc.login(id, password);
		
		if(name != null) {
			System.out.print(id + " 의 모든 정보가 삭제됩니다 삭제 하시겠습니까?(y/n) : ");
			String result = sc.nextLine();
			if(result.equals("y")) {
				if(usc.removeuser(id, password)) System.out.println(id + "삭제 완료");
				else System.out.println("삭제가 실패하였습니다.");
				
			} else {
				System.out.println(id + " 의 삭제를 취소하였습니다.");
			}
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}
	
	public void sellMenu() {
		
		boolean check = true;
		while(check) {
			System.out.println("===== 물품 메뉴 =====");
			System.out.println("1. 물품 등록");
			System.out.println("2. 물품 조회");
			System.out.println("3. 물품 변경");
			System.out.println("4. 물품 삭제");
			System.out.println("9. 사용자 메뉴로");
			System.out.print("원하는 메뉴를 입력하세요 : ");
	
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				signup();
				break;
			case 2:
				viewList();
				break;
			case 3:
				change();
				break;
			case 4:
				remove();
				break;
			case 9:
				userMenu();
				break;
			}
		}
	}

	// 메인메뉴 > 1 누르면 물품등록, 동일이름 상품 있으면 등록 안됨
	public void signup() {
		    
		System.out.print("물품명 : ");
		String name = sc.nextLine();
		System.out.print("물품 갯수 : ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("판매 금액 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("판매자명 : ");
		String seller = sc.nextLine();
			
		if(sec.listup(name, new Seller(name, number, price, seller))) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 실패 (상품명 중복)");
		}
	}
	
	// 메인메뉴 > 2 누르면 조회기능
	public void viewList() {
		System.out.println("===== 물품조회 =====");
		System.out.println("1. 전체 조회");
		System.out.println("2. 상품이름 조회");
		System.out.println("3. 이전메뉴로");
		System.out.print("원하는 메뉴를 입력하세요 : ");	
		
		switch(Integer.parseInt(sc.nextLine())) {
		case 1: // 등록된 hashmap 전체 출력
			System.out.println(selmap); 
			break;
		case 2: // 입력된 상품명과 동일한 상품명이 있으면 벨류 출력
			System.out.println("상품 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			if(selmap.containsKey(name)) {
				System.out.println(selmap.get(name));
			} else {
				System.out.println("등록된 상품이 아닙니다.");
			}
			break;
		case 3: // 메인메뉴로 이동
			main();
			break;
		}
	}
	
	// 메인메뉴 > 3 누르면 물품 변경 동일한 상품명 입력하면 정보 입력 후 변경
	public void change() {
		
		System.out.println("변경할 상품 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		if(selmap.containsKey(name)) {
			System.out.print("물품 갯수 : ");
			int number = Integer.parseInt(sc.nextLine());
			System.out.print("판매 금액 : ");
			int price = Integer.parseInt(sc.nextLine());
			System.out.print("판매자명 : ");
			String seller = sc.nextLine();
			if(sec.changeup(name, new Seller(name, number, price, seller))) {
				System.out.println("변경 성공");
			} else {
				System.out.println("변경 실패 (상품명 오등록)");
			}
		}
	}
	
	// 메인메뉴 > 4 누르면 물품 삭제 상품명 입력후 삭제확인 하면 목록 삭제
	public void remove() {
		System.out.print("삭제할 물품명을 입력해주세요 : ");
		String name = sc.nextLine();
		
		if(selmap.containsKey(name)) {
			System.out.print(name + " 의 모든 정보가 삭제됩니다 삭제 하시겠습니까?(y/n) : ");
			String result = sc.nextLine();
			if(result.equals("y")) {
				sec.remove(name);
				System.out.println(name + "삭제 완료");
			} else {
				System.out.println(name + " 의 삭제를 취소하였습니다.");
			}
		}
	}
}


