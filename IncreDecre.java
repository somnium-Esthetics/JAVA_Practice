package week1_2;

public class IncreDecre {
	public static void main(String[] args) {
		int x = 5, y = 5;
		int z;
		// 1.단독 사용
		x++; // 후위 x=6
		System.out.println("x=" + x); // 6
		--y; // 전위 y=4
		System.out.println("y=" + y); // 4

		// 2.수식에 포함된 경우
		z = ++x; // x=7,z=7,
		System.out.println("z=" + z);// z=7
		z = y++;// z=4 , y=5
		System.out.println("z=" + z);// z=4, y=5 즉 후위 연산자는 맨 나중에 연산

		// 3.메소드 호출에 포함된 경우
		System.out.println("x=" + (x++));// 출력:7, x=8
		System.out.println("x=" + (x + 1));// 출력:9, x=8
		System.out.println("x=" + (x));// 출력:8, x=8
		System.out.println("y=" + (++y));// 출력:6, y=6
		System.out.println("y=" + (y--));// 출력:6, y=5
		System.out.println("y=" + (y - 1));// 출력:4, y=5
		System.out.println("y=" + (y));// 출력:5, y=5

	}

}
