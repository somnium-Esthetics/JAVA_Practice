package week2_2;

public class Ex4_for2 {

	public static void main(String[] args) {
		 int sum = 0, sum_1=0, sum_2=1;
		 for (int i =1; i<=10;i++) {
			 sum+=i;
			 
		 }
		 System.out.println(sum);
		 
		 //1 100까지 합
		 for (int i = 1; i<=100; i++) {
			 sum_1 +=1;
			 
		 }
		 System.out.println(sum_1);
		 
		 //1 10 누적 곱
		 for (int i =1; i<=10; i++) {
			 sum_2*=i;
			 
					 
		 }
		 System.out.println(sum_2);
		 
	}

}
