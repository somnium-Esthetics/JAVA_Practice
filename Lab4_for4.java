package week2_2;

public class Lab4_for4 {

	public static void main(String[] args) {
		//1+ 1+2 + 1+2+3 +1+2+3+4+.....1+2+..+10
		int sum = 0, t=0;
		for (int i =1; i<=10; i++) {
			sum = i+sum;//전 값 저장
			t= t+sum;
			
		}
		System.out.println("totalSum="+t);
	}

}
