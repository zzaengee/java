import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		// 입출력 
		/*
		 - out : 표준출력스트림 => System.out -> 콘솔에 값을 출력
		 - in : 표준입력스트림 => System.in -> 키보드로부터 값을 입력
		 */
		//자바에서 키보드로부터 입력을 받기 위해 Scanner 클래스를 사용하는데, 사용하기 위해서는 import java.util.*;을 해줘야함.
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = in.next(); // 문자열 입력을 받을 때 사용
		
		System.out.print("국어: ");
		int kor = in.nextInt(); // int값을 입력받을때 사용
		
		System.out.print("영어: ");
		int eng = in.nextInt();
		
		System.out.printf("이름: %s / 총점: %d / 평균: %.2f", name, kor+eng, (float)(kor+eng)/2);
	}
}
