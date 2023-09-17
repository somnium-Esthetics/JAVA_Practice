package week3_1;
import java.util.Scanner;
public class DoWhile1 {

	public static void main(String[] args) {
		 int score;
		 Scanner sc = new Scanner(System.in);
		 do {
			 System.out.print("점수를 입력하세요 (0~100):");
			 score = sc.nextInt();
			 
		 }while (score<0||score > 100);//유효하지 않은 점수라면 반복
		 System.out.println("입력된 점수:"+score);
		 //while문으로 고치면 sysout을 한번 더 해줘야함

	}

}
