package com.kh.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 바이트 기반 스트림
 * - 데이터를 바이트(byte) 단위로 주고 받는다.
 * - 그림, 멀티미디어(사진, 비디오 등) 등의 바이너리 데이터를 읽고 출력할 때 사용한다
 * - InputStream, OutputStream : 바이트 기반 입출력 스트림의 최상위 클래스임
 * 
 * 보조 스트림
 * - 스트림의 기능을 향상시키거나 새로운 기능을 추가하기 위해 사용한다
 * - 독립적으로 입출력을 수행할 수 없음
 */

public class ByteStreamTest {

	// 바이너리 데이터(이미지 파일) 을 읽어서 파일로 출력하는 로직
	public static void main(String[] args) {
		
		String fileName = "src/bird.jpg";
		String outfileName = "src/bird_output.jpg";
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			// 기반 스트림 생성
			// FileInputStream, FileOutputStream : 파일에 입출력을 하기 위한 스트림
			FileInputStream fis = new FileInputStream(fileName); // import 진행 시 io는 거의다 에러가 발생됨 -> 트라이 캐치 하면 없어짐
			FileOutputStream fos = new FileOutputStream(outfileName);
			
			// 기반 스트림을 이용해서 보조 스트림 생성
			// DataInputStream, DataOutputStream : 기본형 타입으로 읽고 쓰는 보조 스트림
			dis = new DataInputStream(fis);
			dos = new DataOutputStream(fos);
			
			// 데이터를 읽어서 출력
			int data = 0;
			while((data = dis.read()) != -1) { // 발생되는 오류는 catch에서 Exception 을 IOException으로 변경하면 사라지게 된다
				dos.write(data);				
				} 
			
			}catch(EOFException e) { // 입력 도중 예상외의 파일 종료 예외
				e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			} finally {
				try {
					dis.close();
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
}
