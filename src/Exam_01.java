// Day 2//

public class Exam_01 {
	public static void main(String[] args) {
		
/* 자료형, 변수, 상수
 - 논리자료형 -> boolean : 1byte, true, false
 - 정수자료형 -> byte(-128~127), short(2byte), char(문자 자료형,2byte), int(기본 자료형, 4byte), long(8byte)
 - 실수자료형 -> float(4byte), double(기본자료형,byte)
 	! 실수에서는 double이 기본자료형이기 때문에 float를 쓸 땐 소수 뒤에 f를 붙여야함 ! 
 - 문자열자료형 -> string(4byte)
 
 ! bit는 데이터 처리할 때(처리능력), byte는 데이터 저장할 때(용량) 
 -> 1byte = 8 bit */

		byte a = 10;
		System.out.println("a=" +a);
		byte b =127;
		++b;
		System.out.println("b=" +b);
		--b;
		System.out.println("b=" +b);
		
		int a1 = 10;
		short b1 = 20;
		char c1 = 'A'; /* 문자 자료형은 '문자 하나' */
		long d = 100L; /* 롱에만 L or l을 붙임 */
		String x1 = "aaa";
		
/* 자동형변환 : 작은 크기의 자료형에서 큰 크기의 자료형으로 변환할 때, 컴퓨터가 자동으로 변환
   강제형변환 : 큰 크기의 자료형에서 작은 크기의 자료형으로 변환할 때, 사용자가 필요에 의해 바꾸어 주는 것 */

/* 자료형의 크기 -> 실수형은 정수형보다 항상 크다 */
		long a3 = 10l;
		float b3 = a3; /* 자동형변환 */
		long c3 = (long)b3; /* 강제형변환 */
		
/* byte와 char, short와 char 자료형은 서로 강제형변환 ! char형은 음수값을 처리하지 못함 ! */
		
		int a6 = 10;
		int b6 = 3;
		float c6 = a6/b6;
		System.out.printf("%d / %d = %f", a6, b6, c6);
		// 10 / 3 = 3.000000
		
/* int형 이하 자료형(byte, short, char, int)의 결과는 int이다.
   int형 이상 자료형(int, long, float, double)의 결과는 double> float > long > int 이다.
 */
		// float c6 = a6/(float)b6; -> int 중 하나라도 float으로 변환시켜야함.
		
	}
}


