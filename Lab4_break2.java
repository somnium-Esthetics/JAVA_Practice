package week3_1;
//양수 누적합, 음수 종료, 0무시, 마지막 누적합
import java.util.Scanner;

public class Lab4_break2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=100;
		int sum =0;
		while(num >=0) {
			System.out.print("양수를 입력하세요:");
			 num = sc.nextInt();
			 if(num>=0) {
			 sum +=num;
			 }
			
			 else if ( num<0) {break;}
			 
		}
		System.out.println("양수들의 합계 :"+sum);
		
	}

}
