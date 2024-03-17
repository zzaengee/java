//문자 입력 (예외처리)
import java.io.*;

public class Exam_06 {
	 public static void main(String[] args) throws IOException{
		 System.out.print("임의의 문자를 입력: ");
		 char ch = (char)System.in.read();
		 
		 //int ch = System.in.read();
		 System.out.println("입력하신 문자열은 " +ch);
	 }
}

// 아스키코드때문에 문자를 입력받을 때 예외처리를 해줘야함.
// 그래서 import java.io.*; 임포트 후에 
// public static void main(String[] args) throws IOException 후 
// char 변수 = (char)System.in.read(); 

//-> 하면 문자 그대로 출력할 수 있다.

// 임포트 없이 System.in.read()를 사용할 수 있지만 변수 앞에 int 명시를 해줘야하고
// 아스키코드 때문에 인티져가 출력됨. 

/* 
	public static void main(String[] args) throws IOException{
		System.out.print("첫번째 수 입력 : ");
		int sul = System.in.read();
		System.out.print("두번째 수 입력 : ");
		int su2 = System.in.read();
		
		System.out.print("%d + %d = %d", su1, su2, su1+su2);
}
*/

// 이때 결과는 첫번째 수만 눌러도 마지막 행이 실행되어버림.
// 엔터를 치는 순간 입력값이 되어버리기 때문.
// 이를 해결하기 위해서는 System.out.skip(5); 코드를 넣어야함.

/* 
	public static void main(String[] args) throws IOException{
		System.out.print("첫번째 수 입력 : ");
		int sul = System.in.read();
		System.out.skip(5);
		System.out.print("두번째 수 입력 : ");
		int su2 = System.in.read();
		
		System.out.print("%d + %d = %d", su1, su2, su1+su2);
}
*/

// 이렇게 했을 때는 두번째 수까지 입력을 받을 수 있지만 결과가 예상과 다르게 나오게 된다.
// 이 또한 아스키 코드 때문. 
// 예를 들어 5와 3을 입력해도 5와 3에 해당하는 아스키 코드인 해당하는 숫자가 나오게 됨.
// 원하는 수식을 받기 위해서는 아스키 코드만큼의 값을 빼주면 되는데
// 숫자 0부터 시작하는 아스키 코드의 값은 48이기 때문에 48을 빼주거나 '0'을 빼주면 된다.

/* 
	public static void main(String[] args) throws IOException{
		System.out.print("첫번째 수 입력 : ");
		int sul = System.in.read() -48;
		System.out.skip(5);
		System.out.print("두번째 수 입력 : ");
		int su2 = System.in.read() -'0';
		
		System.out.print("%d + %d = %d", su1, su2, su1+su2);
	}
*/