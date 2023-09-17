package week2_2;
import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {
		//int형 변수 num이 2의 배수 또는 3의 배수 일때 true인 조건식
		//char형 변수 ch가 공백이나 탭이 아닐때 true인 조건식
		//char형 변수 ch사 'y'또는 'Y'일떼 true인 조건식
		//char형 변수 ch가 영문자일때 true인 조건식
		//boolen형 변수 powerOn가 false일때 true인 조건식
		//문자열 참조 변수 str이 'yes'일때 true인 조건식
		Scanner sc = new Scanner(System.in);
		//int형 변수 num이 2의 배수 또는 3의 배수 일때 true인 조건식
		int num = sc.nextInt() ;
		if (num%2==0 || num%3==0){System.out.println("true");
		};
		
		//char형 변수 ch가 공백이나 탭이 아닐때 true인 조건식
		char ch = ' ';
		if( ch !=' '||ch!='\t') {System.out.println("true");}
		
		//char형 변수 ch사 'y'또는 'Y'일떼 true인 조건식
		if (ch == 'y' || ch =='Y') {System.out.println("true");}
		
		//char형 변수 ch가 영문자일때 true인 조건식
		if ((ch >= 97 && ch<= 122)||(ch>=65 && ch <=90)) {System.out.println("true");}
		
		
		//boolen형 변수 powerOn가 false일때 true인 조건식
		boolean powerOn=false;
		if (powerOn == false) {System.out.println("true");}
		
		//문자열 참조 변수 str이 'yes'일때 true인 조건식
		String str = "yes";
		if (str == "yes") {System.out.println("true");}
		
		
		
		}

	}


