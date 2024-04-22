/**
 * 
 * switch用法练习
 * 
 */
import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		//字符小写转换成大写
		System.out.println("输入字符（a - e）");
		char C = myScanner.next().charAt(0);
		switch(C) {
		 case 'a':
			 System.out.println('A');
			 break;
		 case 'b':
			 System.out.println('B');
			 break;
		 case 'c':
			 System.out.println('C');
			 break;
		 case 'd':
			 System.out.println('D');
			 break;
		 case 'e':
			 System.out.println('E');
			 break;
		 default:
			 System.out.println("other 参数错误 输入字符（a - e）");
		}
		System.out.println("switch退出 程序继续");
		
//		//学生成绩
//		System.out.println("输入成绩");
//		double Score = myScanner.nextDouble();
//		if(Score >= 0 && Score <= 100) {
//			switch((int)(Score / 60)) {
//				case 1:
//					System.out.println("合格");
//					break;
//				case 0:
//					System.out.println("不合格");
//					break;
//			}
//		}else {
//			System.out.println("参数错误 输入0-100参数");
//		}
//		System.out.println("switch退出 程序继续");
		
//		//根据月份打印季节
//		System.out.println("输入月份");
//		byte month = myScanner.nextByte();
//		switch(month) {
//		//使用穿透实现
//			case 3:
////				System.out.println("春季");
////				break;
//			case 4:
////				System.out.println("春季");
////				break;
//			case 5:
//				System.out.println("春季");
//				break;
//			case 6:
////				System.out.println("夏季");
////				break;
//			case 7:
////				System.out.println("夏季");
////				break;
//			case 8:
//				System.out.println("夏季");
//				break;
//			case 9:
////				System.out.println("秋季");
////				break;
//			case 10:
////				System.out.println("秋季");
////				break;
//			case 11:
//				System.out.println("秋季");
//				break;
//			case 12:
////				System.out.println("冬季");
////				break;
//			case 1:
////				System.out.println("冬季");
////				break;
//			case 2:
//				System.out.println("冬季");
//				break;
//			default:
//				System.out.println("参数错误 输入（1-12）月份");
//		}
//		System.out.println("switch退出 程序继续");
		
	}
}