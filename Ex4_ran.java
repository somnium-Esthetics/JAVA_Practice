package week2_2;

public class Ex4_ran {

	public static void main(String[] args) {
		int num = 0, n = 0;

		// 실수 난수 생성
		double r = Math.random();
		System.out.println("임의의 실수 :" + r);

		// 1~100사이의 정수난수
		num = (int) (Math.random() * 6) + 1; // 0.0 <= n <6.0에 +1 -> 1.0<= n <7.0
		System.out.println("임의의 정수 :" + num);

		// -5~5사이의 정수 난수
		n = (int) (Math.random() * 11) - 5;
		System.out.println("임의의 정수 :" + n);

		// TODO Auto-generated method stub

	}

}

//random 난수는 무조건 0.0 <= n < 1.0
