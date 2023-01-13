package ch05;

public class GetMinMax {
	public static void main(String[] args) {
		int s[] = {79,88,91,33,100,55,95};
		int max;
		int min;
		
		max = s[0];
		min = s[0];
		
		for(int i=0; i<s.length; i++) {
			if(s[i]<min) {
				min = s[i];
			}else if(s[i]>max) {
				max = s[i];
			}
			
			
		}
		System.out.println(min);
		System.out.println(max);
	}
}
