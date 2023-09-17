package week1_2;

public class round {

	public static void main(String[] args) {
		// Math.round의 반환 타입은 long 정수형
		long result = Math.round(3.5);
		System.out.println(result);

		double pi = 3.141592, pi2 = 3.141592;
		pi = pi * 1000;
		pi = Math.round(pi); // 3142.0 즉 long정수 형태의 값이 double실수 형태로 변환됨
		pi = pi / 1000; // 3.142 즉 실수 / 정수 이므로 실수 몫이 나옴
		System.out.println(pi);

		// 비교
		pi2 = 3.141592;
		pi2 = Math.round(pi2 * 1000) / 1000; // 1000f
		// Math.round(pi2 * 1000) 는 long정수 형태, 3142/1000은 정수/정수 이므로 3출력
		// 그 후 pi2는 double의 실수 값이므로 3 -> 3.0이 됨
		/// 1000을 /1000f로 지정하면 리터럴f때문에 정수/실수 가 되어 실수 몫이 나옴
		System.out.println(pi2);

	}

}
