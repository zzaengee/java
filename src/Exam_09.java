import java.util.*;
import java.io.*;

public class Exam_09 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int a = in.nextInt();
		System.out.print("두번째 정수: ");
		int b = in.nextInt();
		System.out.print("산술연산자: ");
		char c = (char)System.in.read();
		
		if (c == '+') {System.out.printf("%d + %d = %d", a, b, a+b);}
		else if (c =='*') {System.out.printf("%d * %d = %d", a, b, a*b);}
		else if (c =='-') {System.out.printf("%d - %d = %d", a, b, a-b);}
		else {System.out.printf("%d / %d = %f", a, b, (float)(a/b));}
	}
}

