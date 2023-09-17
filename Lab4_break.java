package week3_1;
//1~6 난수 생성, 3 생성시 중단
public class Lab4_break {

	public static void main(String[] args) {
		 int num=0 ;
		 while(true) {
		 num = (int)(Math.random()*6+1);
		 if (num==3) {break;}
		 System.out.println("난수:"+num); 

	}

	}
}
