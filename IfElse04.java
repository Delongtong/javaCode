/**
*
*嵌套分支
*/
import java.util.Scanner;
public class IfElse04{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("预约购买门票系统");
		System.out.println("输入您要预约购买的月份");
		byte month = myScanner.nextByte();
		if(month >= 1 && month <= 12) {
			if(month >= 4 && month <= 10) {
				System.out.println("请输入年龄");
				byte Age = myScanner.nextByte();
				if(Age >= 18 && Age <=60) {
					System.out.println("票价60");
				}else if(Age < 18) {
					System.out.println("票价" + (60 / 2));
				}else {
					System.out.println("票价" + (60.0 / 3));
				}
			}else if(month >= 1 && month <=3 || month > 10 && month <=12) {
				System.out.println("请输入年龄");
				byte Age = myScanner.nextByte();
				if(Age >= 18) {
					System.out.println("票价40");
				}else {
					System.out.println("票价20");
				}
			}
		}else {
			System.out.println("月份参数错误");
		}
		System.out.println("循环结束 程序继续");
	}
}