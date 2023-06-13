package com.kh.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class A_Date {

	public static void main(String[] args) {

		A_Date a = new A_Date();
//		a.method1();
//		a.method2();
//		a.method3();
		a.practice();
		
	}
	
	/* Date
	 *- java.util 패키지에 속한 날짜와 시간을 다룰 목적으로 만들어진 클래스 (JDK 1.0버전에서 추가됨)
	 *- Date 메서드는 대부분 deprecated(비권장) 되어있지만 여전히 사용하고 있다
	 */
	
	public void method1() {
		
		// 기본 생성자로 객체를 생성하면 현재 시스템의 시간에 대한 정보를 가지고 객체를 생성한다
		Date today = new Date(); // Date import 진행 시 java.util 로 임포트 해야함
		System.out.println(today);
		
		// 1970년 1월 1일 00시 -> 한국 표준 시간(KST) 으로 출력될 땐 그리니치 평균시(GMT) 보다 +9 증가된 시간으로 표시되어 9시로 출력된다
		Date when = new Date(0);
		System.out.println(when);
		
		System.out.println();
		
		System.out.println("getYear : " + (today.getYear() + 1900) + "년"); // 1900을 안더해주면 123 출력됨
		System.out.println("getMonth : " + (today.getMonth() + 1) + "월"); // 1을 안더해주면 0부터 시작하기 때문에 당월 -1월로 출력됨
		System.out.println("getDate : " + (today.getDate()) + "일");
		System.out.println("getHours : " + (today.getHours()) + "시");
		System.out.println("getMinutes : " + (today.getMinutes()) + "분");
		System.out.println("getSeconds : " + (today.getSeconds()) + "초");
		
		System.out.println();
		
		/* SimpleDateFormat 클래스 : 날짜 데이터를 원하는 형태로 출력할 수 있도록 해주는 클래스
		 * - 대소문자 정확하게 입력해야함
		 * - y : 년도 / M : 월 / D : 년의 몇번째 일 / d : 월의 몇번째 일 / E : 요일 / a : 오전, 오후 / H : 시간(0~24) / h : 시간(1~12) / m : 분 / s : 초
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss"); // 괄호안에 위의 대소문자를 입력해서 원하는 형태의 포멧을 정해야함
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
		// 2023년 6월 13일 (화) 오후 2시 21분 10초 처럼 출력되도록 포멧 만들어보기
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");
		formatDate = sdf.format(today);
		System.out.println(formatDate);
	}

	/* Calendar 
	 * - Date 클래스를 개선한 추상 클래스 (JDK 1.1 버전에서 추가됨)
	 * - 오래된 클래스로 여전히 단점이 존재한다
	 */
	
	public void method2() {
		
//		Calendar cal = new Caleander(0;) // import java.util.Calendar; 해도 오류가 발생함, 추상클래스는 객체 생성이 안되기 때문임
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		today = new GregorianCalendar(); // 태국은 BuddhistCalendar 로 반환해야 표현 가능함 나머지는 GregorianCalendar 로 하면됨
		System.out.println(today);
		
		System.out.println();

		System.out.println("YEAR : " + today.get(Calendar.YEAR) + "년");
		System.out.println("MONTH : " + (today.get(Calendar.MONTH) + 1) + "월"); // 1을 안더해주면 0부터 시작하기 때문에 당월 -1월로 출력됨
		System.out.println("DATE : " + today.get(Calendar.DATE) + "일");
		System.out.println("HOUR : " + today.get(Calendar.HOUR) + "시"); // 12시간 표기법
		System.out.println("HOURS_OF_DAY: " + today.get(Calendar.HOUR_OF_DAY) + "시"); // 24시간 표기법
		System.out.println("MINUTE : " + today.get(Calendar.MINUTE) + "분");
		System.out.println("SECOND : " + today.get(Calendar.SECOND) + "초");
		
		System.out.println();

		// 날짜 지정
		Calendar date = Calendar.getInstance();
		date.set(2023, Calendar.MAY, 15, 9, 0, 0); // 월에 숫자를 입력하면 숫자 +1로 나와서 Calendar.월 로 별도 지정해야 한다
		System.out.println(date);
		System.out.println(date.getTime().toString());
		
		System.out.println();
		
		long timeInMillis = date.getTimeInMillis();
		System.out.println("1000분의 1초 : " + timeInMillis); // 출력 시 1970년(시작점) 부터 지금까지 1000분의 1초로 표현
		long second = timeInMillis/1000;
		System.out.println("1000분의 1초를 초로 변환 : " + second);
		long minute = second/60;
		System.out.println("초를 분으로 변환 : " + minute);
		long hour = minute/60;
		System.out.println("분을 시로 변환 : " + hour);
		long day = hour/24;
		System.out.println("시를 일로 변환 : " + day);
		long year = day/365;
		System.out.println("일을 년으로 변환 : " + year);
		
		System.out.println();
	
		// SimpleDateFormat 클래스 사용하여 Calendar 표현 가능
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(date.getTime());
		System.out.println(formatDate);
		
	}
	
	// Date와 Calendar 간의 변화
	public void method3() {
		
		// 1. Calendar -> Date : .getTimeInMillis() 사용
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		System.out.println(d);
		
		// 2. Date -> Calendar : .setTime() 사용 및 출력 시 .getTime().toString() 사용
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		System.out.println(cal2.getTime().toString());
		
	}
	
	// 자신이 태어난 날을 yyyy/MM/dd 형태로 입력받아 해당 날짜가 무슨 요일이었는지, 지금까지 며칠이 지났는지 계산하기
	// 입력된 형식이 잘못된 경우 다시 입력받을 수 있도록 출력문 만들기
	public void practice()  {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date today = new Date(); 
		
		String today1 = sdf.format(today);
		System.out.println(today1);

		System.out.print("태어난 날짜 입력 (yyyy/MM/dd) : ");
		String birth = sc.nextLine();
		System.out.println(birth);

	}
	
}
