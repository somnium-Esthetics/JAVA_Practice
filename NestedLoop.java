package week3_1;

public class NestedLoop {

	public static void main(String[] args) {
		// ppp:
		 for(int i =2; i<=9; i++) {
			 for (int j = 1; j<=9; j++) {
				 if(j==3) {break;}// ppp;} 이중 반복도 탈출 가능
				 System.out.printf("%d * %d = %d\n",i,j,i*j);
			 }
			 System.out.println();
		 }

	}

}
