//Day 02//
public class Exam_02 {
// 연산자 
/*
1. 최우선연산자 
 - ., [], ()
2. 단항연산자
 - !, ~ (부정연산자) / +/-, ++/-- (증감연산자) / (cast) (형변환연산자)
 - instanceof (다형성연산자) 
3. 산술연산자
 - *, /, %, +, -
4. 시프트연산자 (byte 이진수)
 - <<, >>, >>>
5. 관계연산자
 - >, <, >=, <=, ==, !=
6. 비트연산자
 - &, |, ^(xor 같으면 0, 틀리면 1)
7. 논리연산자
 - &&, ||
 - &, |
8. 삼항연산자
 - 조건항 ? 항1 : 항2;
9. 배정대입연산자
 - =, +=, -=, *=, /=, %=, <<=, >>=, >>>=
10. 컴마연산자
 - ,
*/
	public static void main(String[] args) {
		int a = 9;
		System.out.print(a == 10 ? "a의 값은 10입니다." : "a의 값은 10이 아닙니다.");
		//a의 값은 10이 아닙니다.
	}
}