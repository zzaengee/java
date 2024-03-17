import java.util.*;
public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int a = in.nextInt();
		System.out.print("두번째 정수: ");
		int b = in.nextInt();
		System.out.print("세번째 정수: ");
		int c = in.nextInt();
		
		if (a>=b) {
			if (c<=a) {
				if (c<=b) {
					System.out.print(a+">="+b+">="+c);}
				else if (c>=b) {
					System.out.print( a+">="+c+">="+b);}
			}
			else if (c>=a) {
				System.out.print( c+">="+a+">="+b);
			}
		}else if (a<=b) {
			if (c>=a) {
				if (c<=b) {
					System.out.print(b+">="+c+">="+a);}
				else if (c>=b) {
					System.out.print(c+">="+b+">="+a);}
			}
			else if (c<=a) {
				System.out.print(b+">="+a+">="+c);
			}
		}
	}
}

/*
//제일큰수는 su1로, 두번째큰수는 su2로, 세번째 큰수는 su3으로 이동
		if (su2>su1 && su2>=su3) {
			int imsi = su1;	
			su1 = su2;
			su2 = imsi;
		}else if (su3>su1 && su3>su2) {
			int imsi = su1;
			su1 = su3;
			su3 = imsi;
		}//if문 종료후 제일 큰수는 su1에 들어가진다
		
		if (su3 > su2) {
			int imsi = su2;
			su2 = su3;
			su3 = imsi;
		}//if문 종료후 두번째 큰수가 su2에 들어가고, 제일 작은수가 su3에 들어간다
		
		
		System.out.printf("%d >= %d >= %d\n", su1, su2, su3);
*/