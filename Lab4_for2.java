package week2_2;
import java.util.Scanner;

public class Lab4_for2 {

	public static void main(String[] args) {
		//n입력, n!
		System.out.print("정수를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =1;
		for (int i=1; i<=n; i++) {
			k=k*i;
		}
		System.out.println(n+"!은 "+k+"입니다.");
	}

}
