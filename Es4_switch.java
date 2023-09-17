package week2_2;

import java.util.Scanner;

public class Es4_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적은 ");
		int score = sc.nextInt(), num = 9;

		switch (score / 10) {
		case 9:
		case 10:
			System.out.println("A학점 입니다");
			break;
		case 8:
			System.out.println("B학점 입니다");
			break;
		case 7:
			System.out.println("C학점 입니다");
			break;
		case 6:
			System.out.println("D학점 입니다");
			break;
		default:
			System.out.println("F학점 입니다");

		}

	}

}
