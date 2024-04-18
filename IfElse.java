import java.util.Scanner;
public class IfElse{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("输入你的年龄");
		int Age = myScanner.nextInt();
		if(Age < 100) {
			if(Age >= 18) {
				System.out.println("已成年");
			}else {
				System.out.println("未成年");
			}
		}else {
			System.out.println("请输入100以内的年龄");
		}
		System.out.println("退出循环 程序继续");
	}
}