package com.kh.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* IO (Input / Output)
 * - 입력과 출려
 * - 두 대상 간의 데이터를 주고 받는 것
 * - 입력 : 키보드, 파일, 네트워크
 * - 출력 : 모니터, 파일, 네트워크
 * 
 * 스트림(stream)
 * - 데이터를 운반하는 연결 통로
 * - 연속적인 데이터 흐름을 물(stream)에 비유함
 * - 하나의 스트림으로 입출력을 동시에 수행할 수 없음 (단방향 통신)
 * - 입출력을 동시에 수행하려면 2개의 스트림이 필요함
 */

public class KeyboardInputTest {

	// 키보드로 데이터를 읽어들여서 콘솔로 출력하는 로직
	public static void main(String[] args) {
		// 1. 스트림 생성 : 입력 스트림만 필요
		InputStreamReader ir = new InputStreamReader(System.in); // 기반 스트림 이라고 함
		BufferedReader br = new BufferedReader(ir); // 보조 스트림 : 기반 스트림을 () 에 담아야 한다
		
		// 2. 읽어들인다 : readline() 메서드
		try {
			String line = br.readLine();  // try, catch 하지 않으면 오류 발생함
			while(line != null) {
				// 3. 콘솔로 출력 : System.out.println();
				System.out.println("Reading Date : " + line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close(); // try, catch 하지 않으면 오류 발생함 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
