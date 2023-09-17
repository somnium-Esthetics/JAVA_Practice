package week2_2;
import java.util.Scanner;

public class Ex4_switch2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("성적은 ?");
		int score = s.nextInt();
		
		//방법 1
		switch (score/10) {
		case 10, 9 -> System.out.println("A학점 입니다.");
		case 8 -> {System.out.println("B학점 입니다.");System.out.println("A학점을 향하여");}
		case 7 -> System.out.println("C학점 입니다.");
		case 6 -> System.out.println("D학점 입니다.");
		
		}// 스위치 문은 ; 필요 없음 
		
		//방법 2 = 값을 반환하는 스위치 문
		char g =' ';
		g = switch (score/10) {
		case 10, 9 -> { System.out.println("칭찬합니다");
		yield 'A';}
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F'; // 반환 스위치 문은 디폴트 필요, ; 필요		}
		};
		System.out.println(g+"학점 입니다");
		
		//방법 3
		System.out.println(switch(score/10) {
		case 10, 9 -> {
			System.out.println("A학점 입니다.");
			yield 'A';}
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		} + "학점 입니다");
		
				// TODO Auto-generated method stub

	}

}
