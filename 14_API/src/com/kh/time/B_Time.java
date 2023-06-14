package com.kh.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/* java.time 패키지
 * - Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공한다 (JDK1.8 에서 제공함)
 * - LocalDate, LocalTime, LocalDateTime, ZoneDateTime 클래스 등이 포함되어 있다
 * - 날짜와 시간에 대한 다양한 메서드를 제공
 */

public class B_Time {

	public static void main(String[] args) {

		B_Time b = new B_Time();
//		b.method1();
//		b.method2();
//		b.method3();
		b.method4();
	}
	
	public void method1() {
		
		/* LocalDateTime
		 * - 날짜와 시간 정보를 모두 저장 할 수 있다
		 */
		
		// 현시각 출력하기
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now : " + now);
		
		// 날짜 지정해서 출력하기
		LocalDateTime when = LocalDateTime.of(2023, 11, 1, 17, 50, 0); // 연도,월,일,시,분,초
		System.out.println("when : " + when);
		
		System.out.println();
		
		// ZonedDateTime : LocalDateTime(날짜, 시간) + 위치에 해당하는 시간대
		System.out.println("ZonedDateTime : " + ZonedDateTime.now());
		 
		// 년, 월, 일, 요일, 시, 분, 초, 
		System.out.println("년도 : " + now.getYear());
		System.out.println("월 : " + now.getMonth()); // 월 영어로 출력
		System.out.println("월 : " + now.getMonthValue()); // 월 숫자로 출력
		System.out.println("일 : " + now.getDayOfMonth()); // 1~31로 일 출력
		System.out.println("일 : " + now.getDayOfYear()); // 1~365로 일 출력
		System.out.println("요일 : " + now.getDayOfWeek()); // 영어로 요일 출력
		System.out.println("시 : " + now.getHour()); // 0~23로 시간 출력
		System.out.println("분 : " + now.getMinute());
		System.out.println("초 : " + now.getSecond());
		
		System.out.println();
		
		// 날짜 조작
		LocalDateTime plusDays = now.plusDays(1).plusMonths(2).plusYears(1);
		// 괄호 안에 숫자만큼 더해짐
		System.out.println(plusDays);
		// 오늘이 해당 날짜보다 이후인지 이전인지 확인하기 
		System.out.println("isAfter : " + now.isAfter(plusDays)); // 이후
		System.out.println("isAfter : " + now.isBefore(plusDays)); // 이전
		// 괄호 안에 숫자 만큼 빼짐
		LocalDateTime minusDays = now.minusMinutes(2).minusDays(10).minusYears(3);
		System.out.println(minusDays);
		// 괄호 안에 작성한 숫자로 변경
		LocalDateTime withDays = now.withYear(2025).withMonth(3).withDayOfMonth(1);
		System.out.println("withDays : " + withDays);
		
		System.out.println();
		
		/* LocalDate
		 * - 날짜 정보만 저장되어 있음
		 */
		
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate); // 년-월-일 만 출력됨
		localDate = LocalDate.of(2023, 11, 1); // 괄호 년, 월, 일 로 날짜로 변경
		System.out.println("localDate2 : " + localDate);
		localDate = now.toLocalDate(); // 오늘 날짜로 변경
		System.out.println("localDate3 : " + localDate);
		
		System.out.println();
		
		/* LocalTime
		 * - 시간 정보만 저장되어 있음
		 */
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);
		localTime = LocalTime.of(9,  27, 34); // 괄호안에 시, 분, 초 로 변경
		System.out.println("localTime2 : " + localTime);
		localTime = now.toLocalTime(); // 현 시각으로 변경
		System.out.println("localTime3 : " + localTime);
		
		System.out.println();
		
	}

	/* Period 와 Duration
	 * - 날짜와 시간 간격을 표현하기 위한 클래스
	 * - Period 두 날짜 간의 차이
	 * - Duration : 시간의 차이
	 */
	
	public void method2() {
		// between() : 두 날짜의 차이
		LocalDate date1 = LocalDate.of(2023, 1, 1);
		LocalDate date2 = LocalDate.of(2024, 12, 31);
		
		Period pe = Period.between(date1, date2);
		System.out.println("period : " + pe); // P1Y11M30D 로 출력됨
		System.out.println("years : " + pe.getYears()); // 연도 차이만 출력 위에서 1Y에 해당함
		System.out.println("years : " + pe.get(ChronoUnit.YEARS)); // 위와 동일
		System.out.println("months : " + pe.getMonths()); // 월 차이만 출력 위에서 11M에 해당함
		System.out.println("months : " + pe.get(ChronoUnit.MONTHS)); // 위와 동일
		System.out.println("days : " + pe.getDays()); // 일 차이만 출력 위에서 30D에 해당함
		System.out.println("days : " + pe.get(ChronoUnit.DAYS)); // 위와 동일
		
		pe = pe.plusYears(3).multipliedBy(2); // 3년을 더하고 2배를 곱한다
		System.out.println("연산 후 : " + pe); // P8Y22M60D
		
		System.out.println();

		LocalTime time1 = LocalTime.of(00, 00, 00);
		LocalTime time2 = LocalTime.of(10, 36, 56);
		
		Duration du = Duration.between(time1, time2);
		System.out.println("duration : " + du); // PT10H36M56S 로 출력됨
		
		du = du.plusHours(1).dividedBy(60); // 1시간을 더하고 60으로 나눈다

		LocalTime time = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		System.out.println("HOURS : " + time.getHour());
		System.out.println("MINUTE : " + time.getMinute());
		System.out.println("SECOND : " + time.getSecond());

	}
	
	public void method3() {
		
		// 문자열을 LocatDate 객체로 파싱
		LocalDate date = LocalDate.parse("2023-05-11");
		System.out.println(date);
		
		date = LocalDate.parse("2023.05.11", DateTimeFormatter.ofPattern("yyyy.MM.dd")); // . 형식이 맞지 않아 출력 시 오류 발생함 DateTimeFormatter.ofPattern() 로 형식을 지정하면 오류 안생김
		System.out.println(date);
		
		date = LocalDate.parse("20230511", DateTimeFormatter.BASIC_ISO_DATE); // 역시 형식이 맞지 않아 출력 시 오류가 발생하고 DateTimeFormatter.BASIC_ISO_DATE 를 작성해야 오류가 안생김
		System.out.println(date);
		
		System.out.println();
		
		/* DateTimeFormatter
		 * - 날짜와 시간을 포맷팅(Formatter) 된 문자열로 반환하는 메서드를 제공하는 클래스
		 */
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter ofPettern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(today.format(ofPettern));
		
		// DateTimeFormatter에 표준화된 포맷들이 상수로 미리 정의
		System.out.println(today.format(DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(today.format(DateTimeFormatter.ISO_ORDINAL_DATE));
		
		// ZonedDateTime Format~ 아래 예시 외에도 다양한 포맷들이 있음
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
		
	}
	
	// D-Day 계산기 : 년 월 일을 입력하여 디데이 계산
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 : ");
		int year = Integer.parseInt(sc.nextLine());
		System.out.print("월 : ");
		int month = Integer.parseInt(sc.nextLine());
		System.out.print("일 : ");
		int day = Integer.parseInt(sc.nextLine());
		
		LocalDate nowDate = LocalDate.now();
		LocalDate inputDate = LocalDate.of(year, month, day);
		
		long dDay = ChronoUnit.DAYS.between(nowDate, inputDate);
		dDay = nowDate.until(inputDate, ChronoUnit.DAYS); // 윗 줄과 같은 내용
		
		if(dDay == 0) {
			System.out.println("오늘이 D-Day 입니다!");
		} else if (dDay > 0) { 
			System.out.println(inputDate + " 까지 남은 D-Day -" + dDay);
		} else {
			System.out.println("D-Day 설정일이 오늘 이전 날짜입니다.");
			System.out.println("태어난 날부터 지금까지" + -(dDay) + "일 지났습니다.");
		}

	}
	
}
