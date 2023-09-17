package week2_2;

public class As_구구단 {

	public static void main(String[] args) {
		//1*1=1  2*1=2  3*1=3 ....
		//1*2=2  2*2=4  3*2=6
		//1*3=3  2*3=6  3*3=9
		
		for (int i=1;i<=9;i++) {
			for (int j=1; j<=9; j++) {
				System.out.print(j+"*"+i+"="+j*i+"  ");
			}
			System.out.println();
		}
	}

}
