package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Application {

	public static void main(String[] args) {

		// ------------------- 출력될 화면 ---------------------
		Scanner sc = new Scanner(System.in); // import 필수
				
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind= sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		// --------------------------------------------------
		// -------------데이터를 서버한테 요청하는 곳 --------------
		SnackController snackControl = new SnackController(); // import 필수
		Snack viewSnack = new Snack(kind, name, flavor, numOf, price); // import 필수, 괄효 안에 순서 멤버변수 순서 동일하게 입력 필수!
		snackControl.saveData(viewSnack); // 메소드 연결이 잘 되었는지 확인할때는 컨트롤 + 클릭 ex) saveData를 클릭하면 SnackController 로 연결됨
		// ---------------------------------------------------
		// --서버한테 응답받아 데이터 결과를 받아서 다시 화면으로 돌아온 곳--
		System.out.println("저장 완료 되었습니다.");
		System.out.println(snackControl.confirmData());
		// ---------------------------------------------------

	}

}
