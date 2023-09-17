package week2_2;

public class Lab4_for1 {

	public static void main(String[] args) {
		//1~100중 3 or 5배수 총합
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i%3==0 || i%5==0) {
				sum = sum+i;
			}
		
		}
System.out.println("sum="+sum);
	}

}
