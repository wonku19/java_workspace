package com.kh.variable;

public class C_Printf {

	public static void main(String[] args) {
		
		//System.out.print(출력값); - 출력만 진행하고 줄바꿈을 자동으로 안해줌
		//System.out.print(출력값); - 출력만 진행하고 줄바꿈을 자동으로 해줌

		System.out.print("hello\n"); // 출력값 뒤에 \n 을 입력하면 줄바꿈을 해줌
		System.out.println("hello");
		
		/* System.out.printf("출력하고자하는형식(포맷)", 출력값, 출력값, 값, ...); - 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행하고 줄바꿈을 자동으로 안해줌
		   - 포멧으로 쓰이는 키워드 : %d : 정수
		                        %f : 실수
		                        %c : 문자
		                        %s : 문자열 (문자도 가능)
		*/
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 10%, 20%로 출력되는 출력문 만들기
		System.out.println(iNum1 + "% " + iNum2 + "%");
		System.out.printf("%d%% %d%%", iNum1, iNum2); // printf 에서는 출력하고자 하는 형식의 앞에 항상 %를 붙여야함 %d - 정수 / %% - % 표시
		
		System.out.println("--------------------");

		System.out.printf("%5d\n", iNum1); // %d인 정수로 표현하되 5를 기재하여 5칸을 확보하고 양수는 오른쪽 정렬하여 출력하고 음수로 숫자를 기재하면 왼쪽으로 정렬함
		System.out.printf("%5d\n", iNum2);
		System.out.printf("%-5d\n", iNum2);
		
		System.out.println("--------------------");

		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		// 무조건 소수점 아래 6번째 자리까지 보여줌 모자르면 0으로 채워서 소수점 아래 6번째 자리까지 출력함
		System.out.printf("%f\t%f\n", dNum1, dNum2); // \t는 키보드의 tap 키 기능임
		System.out.printf("%f\t%.2f\n", dNum1, dNum2); // 소수점을 지정하고 싶으면 (%.(숫자)(포멧)) 로 원하는 소수점을 표시하면됨
		
		System.out.println("--------------------");

		
		char ch = 'a';
		String str = "Hello";
		
		// a Hello a 로 출력되는 출력문 만들기
		System.out.printf("%c %s %c\n", ch, str, ch);
		System.out.printf("%C %S %C\n", ch, str, ch); // 문자열 포맷은 대문자로 기재하면 출력문이 대문자가됨

	}
}
