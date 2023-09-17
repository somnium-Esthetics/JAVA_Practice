package week1_2;

public class TypeCasting {

	public static void main(String[] args) {
		//1.형변환 연산자 이용하기
		double doubleVal = 3.14;
		int intVal = (int)doubleVal;//정수로 변환
		System.out.println(intVal);
		float floatVal = (float)82.5;// 타입을 알려주는 
		byte byteVal = 10;
		System.out.println(byteVal);
		
		
		//2. 자동 형변환 
		intVal = /*(int)*/byteVal;
		floatVal = /*(float)*/1000;
		int result1 = 60/6;
		System.out.println("정수의 나눗셈 결과 :"+result1);
		double result2 = (double)60/6;
		System.out.println("실수의 나눗셈 결과 :"+result2);
		
		//int보다 작은 타입일 경우 자동으로 형변환
		byte a = 5, b = 3;
		byte result3 = (byte)(a*b);
		char charVal = 'a';
		charVal = (char)(charVal+1);
		System.out.println(charVal);
		
		int c = 1_000_000; // 백만
		int d = 1_000_000; // 백만
		long result4 = (long)c*d; //int 범위 초과
		System.out.println(result4);
		String strVal = 3+"7";
		System.out.println(strVal);
		strVal = 3+3+"7";
		System.out.println(strVal);
		
		
		//형식   (타입)피연산자;
		// 작은 타입으로의 형변환은 값 손실의 가능성 존재
		//보다 큰 타입으로의 형변환은 형 변환 연산자 생략 가능
		//연산식 에서 두 피연산자의 타입이 다른경우 -> 더 큰 타입으로 자동 변환
		//바이트,short,char의 경우 산술식에서 피연산자로 사용될시 자동으로 int
	
		

	}

}
