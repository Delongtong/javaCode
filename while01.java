/**
 * 
 * @author tongdelong
 *while
 */
public class while01{
	public static void main(String[] args) {
		
//		//打印1-10
//		int Num1 = 1;
//		while(Num1 <= 10) {
//			System.out.println(Num1);
//			Num1++;//如果没有Num1++；while将会无限循环
//		}
//		System.out.println(Num1);//11
		
		
//		//打印1-100能被3整除的数
//		int Start = 1;
//		int End = 100;
//		int A = 3;
//		while(Start <= End) {
//			if(Num2 % A == 0) {
//				System.out.println(Start);
//			}
//			Start++;
//		}
		
//		//打印4-200之间的所有偶数
		int Start = 40;
		int End = 200;
		while(Start <= End) {
			if(Start % 2 == 0) {
				System.out.println(Start);
			}
			Start++;
		}
		
	}
}