package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataStreamEx {
	public static void main(String[] args) {
		try {
			//DataOutputStream은 이진파일(binary file)처리하는 객체
			DataOutputStream dataout = new DataOutputStream(new FileOutputStream("C:\\work_java\\javaProject\\src\\ch17\\test.dat"));
			dataout.writeInt(123);//숫자 형식의 자료를 파일에 저장
			dataout.writeChar('A');//문자 형식의 자료를  파일에 저장
			dataout.writeDouble(3.5);//싱수형식
			dataout.close();//스트림 닫기(파일이 완성됨)
			System.out.println("저장되었습니다.");
			
			//DataInputStream: 이진파일 읽기 위한 객체
			DataInputStream datain = new DataInputStream
					(new FileInputStream("C:\\work_java\\javaProject\\src\\ch17\\test.dat"));
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
