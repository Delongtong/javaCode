/**
 * 
 * @author tongdelong
 *
 */
import java.util.Scanner;
public class DoWhileExercise{
	public static void main(String[] args) {
	
//		int Start = 1;
//		int End = 100;
//		int Sum = 0;
//		do {
//			Sum += Start;
//			System.out.println(Start);
//			Start++;
//		}while(Start <= End);
//		System.out.println("和" + Sum);
	
//		int Start = 1;
//		int End = 200;
//		int Count = 0;
//		do {
//			if(Start % 5 == 0 && Start % 3 != 0) {
//				Count++;
//				System.out.println(Start);
//			}
//			Start++;
//		}while(Start <= End);
//		System.out.println("个数" + Count);
		
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("11111");
			System.out.println("y or other");
			answer = myScanner.next().charAt(0);
		}while(answer != 'y');
		System.out.println("循环结束");
		
		
		
		
		
	
		
	}
}