package ch18;

import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {
		String str= null;
		try {
			RandomAccessFile file = new RandomAccessFile("C:\\work_java\\javaProject\\src\\ch17\\rand2.txt", "rw");
			System.out.println(file.getFilePointer());//0
			//getFilePointer(): 파일포인터 (파일을 어디까지 읽었는지 가리킴)
			file.seek(8);
			System.out.println(file.getFilePointer());
			file.write("park".getBytes());//기존것을 변경
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			while(file.getFilePointer()<file.length()) {
				str = file.readLine();
				str = new String(str.getBytes("8859_1"),"utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();
			System.out.println("파일이 저장되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
