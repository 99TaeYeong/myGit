package ch05;

public class ArrayScore2D {
	public static void main(String[] args) {
		//5행3열
		int[][] score = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
		
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<score.length; i++) {
			int sum=0;//총점
			float avg=0.0f; //평균
			System.out.printf("%d\t",i+1);//번호출력
			for(int j = 0 ; j<score[i].length;j++) {//국,영,수 배열값 처리
				sum +=score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			avg = sum/score[i].length;//평균계산
			
			//출력
			
			if(avg>90) {
				System.out.println(sum+"\t"+avg+"\t"+" A ");
			}else if(avg>80){
				System.out.println(sum+"\t"+avg+"\t"+" B ");
			}else if(avg>70){
				System.out.println(sum+"\t"+avg+"\t"+" C ");
			}else if(avg>60){
				System.out.println(sum+"\t"+avg+"\t"+" D ");
			}else{
				System.out.println(sum+"\t"+avg+"\t"+" F ");
			}
			
		}
	}
			
}


