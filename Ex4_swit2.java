package week2_2;

import java.util.Scanner;

public class Ex4_swit2 {

	public static void main(String[] args) {
		System.out.println("계절은 ?");
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		switch (S) {
		case "봄":
			System.out.println("Spring");
			break;
		case "여름":
			System.out.println("Summer");
			break;
		case "가을":
			System.out.println("Fall");
			break;
		case "겨울":
			System.out.println("Winter");
			break;
		default:
			System.out.println("사계절이 아니네요");
			break;

		}
		// TODO Auto-generated method stub

	}

}
