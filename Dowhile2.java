package week3_1;
import java.util.Scanner;

public class Dowhile2 {

	public static void main(String[] args) {
		int ans = 0,r;
		r = (int)(Math.random()*50)+1;//1~50난수 생성
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1~50 사이의 정수를 입력하세요:");
			ans = sc.nextInt();
			if(ans>r) {
				System.out.println("더 작은수로 도전하세요");
			}
			else if(ans<r){
				System.out.println("더 큰수로 도전하세요");
			}
		}while (ans!= r);//맞추지 못하면 반복
		System.out.println("정답입니다");
		
	}

}
