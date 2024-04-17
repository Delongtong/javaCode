/**
 * 
 * @author tongdelong
 * 
 *练习
 *
 */


public class LogicTest{
	public static void main(String[] args) {
		
//		int X = 5 , Y = 5;
//		if(X++ == 6 && ++Y == 6) {
//			System.out.println(X = 11);//不执行
//		}
//		System.out.println("X = " + X + "\n" + "Y = " + Y);//6 5
		
//		int X = 5 , Y = 5;
//		if(X++ == 6 & ++Y == 6) {
//			System.out.println(X = 11);//不执行
//		}
//		System.out.println("X = " + X + "\n" + "Y = " + Y);//6 6
		
//		int X = 5 , Y = 5;
//		if(X++ == 5 | ++Y == 5) {
//			System.out.println(X = 11);//执行
//		}
//		System.out.println("X = " + X + "\n" + "Y = " + Y);//11 6
		
		int X = 5 , Y = 5;
		if(X++ == 5 || ++Y == 5) {
			System.out.println(X = 11);//执行
		}
		System.out.println("X = " + X + "\n" + "Y = " + Y);//11 5
		
		boolean A = true , B = false;
		double C = 44.4;
		if((C++ == 44.4) && (B = true))//45.4
			C++;//46.4
		if((A = false) || (++C == 47.4))//47.4
			C++;//48.4
		System.out.println("C = " + C);//48.4
		
	}
}