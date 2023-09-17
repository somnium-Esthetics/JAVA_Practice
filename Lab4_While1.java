package week3_1;
/* *****
 * *****
 * *****
 * while 로 출력하기
 */
public class Lab4_While1 {

	public static void main(String[] args) {
		int num1 =0, num2=0;
		while(num1<=2) {
			while(num2<=4) {
				System.out.print("*");
				num2++;
			}
			System.out.println();
			num2=0;
			num1++;	
		}
	}
}
/* 
for (int i=0; i<3; i++){
for (int j=0; j<5; j++){
sysout("*");
}
sysout();

*/
