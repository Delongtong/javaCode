/**
*
*
*/
import java.util.Scanner;
public class Switch01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("输入字符(a - g)");
		char charActer = myScanner.next().charAt(0);
		double Score = 1.1;
		switch(charActer) {
//		switch(Score) {错误 switch语句只能使用（byte short int char enum String）其中类型
			case 'a'://case必须是一个常量
//			case "hello":错误接收的是char类型  不能用不能自动转换的String数据类型
				System.out.println("星期一");
				break;//没有break时 会继续执行下面语句
			case 'b':
				System.out.println("星期二");
				break;
			//....
			default://default可选 非必要公式
				System.out.println("无匹配字符");	
		}
		System.out.println("退出switch 程序继续");
		

	}
}