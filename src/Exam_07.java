//제어문
import java.util.*;
public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int a = in.nextInt();
		
		if (a%3 == 0 && a%5 !=0) {
			System.out.print("3의 배수입니다.");
		}else if (a%3 !=0 && a%5 ==0) {
			System.out.print("5의 배수입니다.");
		}else if (a%3 == 0 && a%5 ==0){
			System.out.print("3과 5의 배수입니다.");
		}else {
			System.out.print("3과 5의 배수가 아닙니다.");
		}
	}
}
