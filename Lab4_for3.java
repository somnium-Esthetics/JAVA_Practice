package week2_2;
import java.util.Scanner;

public class Lab4_for3 {

	public static void main(String[] args) {
		//입력받은 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		int n = sc.nextInt();
		for (int i=1; i<=9; i++) {
			System.out.println(n+"*"+i+"="+i*n);
		}
	}

}
