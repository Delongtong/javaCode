/**
 * 
 * 分支练习题 共3个
 * 
 */
import java.util.Scanner;
public class IfElseExercise01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

////		1.判断第一个数大于10.0 且第二个数小于20.0 打印两数之和
//		System.out.println("请输入第一个参数 需大于10.0");
//		double A = myScanner.nextDouble();
//		if(A > 10.0) {
//			System.out.println("请输入第二个参数 需小于20.0");
//			double B = myScanner.nextDouble();
//			if(B < 20.0) {
//				//求A和B和需要加() 不然就会被当作字符串被拼接起来
//				System.out.println("输入参数符合计算条件 两数之和为" + (A + B));
//			}else {
//				System.out.println("不满足参数条件 输入的第二个参数需要小于20.0");
//			}
//		}else {
//			System.out.println("不满足参数条件 输入的第一个参数需要大于10.0");
//		}
//		System.out.println("循环判断结束 程序继续");
		
////	    2.判断两数之和既能被3又能被5整除
//		System.out.println("输入第一个参数");
//		int Num1 = myScanner.nextInt();
//		System.out.println("输入第二个参数");
//		int Num2 = myScanner.nextInt();
//		int Sum = Num1 + Num2;
////		求能不能整除要取余
//		if((Sum % 3 == 0) && (Sum % 5 == 0)) {
//			System.out.println("输入的两个参数之和:" + Sum + " 既可以被3 又可以被5整除");
//		}else {
//			System.out.println("输入的两个参数之和:" + Sum + " 不能即被3 又被5整除");
//		}
//		System.out.println("循环判断结束 程序继续");
		
//		3.判断年份是否为闰年
		System.out.println("输入年份");
		int Year = myScanner.nextInt();
//		求能不能整除要取余 Year % 400 == 0 不必要用()括起来
		if(Year % 400 == 0  || ((Year % 4 == 0) && (Year % 100 != 0))) {
			System.out.println("该年份是闰年");
		}else {
			System.out.println("该年份不是闰年");
		}
		System.out.println("循环判断结束 程序继续");
	}
}