package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {
		int num[] = {29,1,81,70,13,92,36};
		Arrays.sort(num);
		for(int i :num) {
			System.out.print(i+ " " );
		}
		System.out.println();
		System.out.println("=================");
		//내림차순 정렬
		//Collection.reverseOder()라는 메소드를 써서 정리한다.
		Integer rev[] = {29,1,81,70,13,92,36};
		Arrays.sort(rev, Collections.reverseOrder());
		for(int i : rev) {
			System.out.print(i+" ");
		}
		
	}
}
