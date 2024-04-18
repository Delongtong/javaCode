/**
 * if快速入门
 */
import java.util.Scanner;
public class If01{
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		short Age = myScanner.nextShort();
		if(Age >= 18) {
			System.out.println("你已成年 要对自己的行为负责");
		}
		System.out.println("程序继续。。。");
		
	}
}