/**
 * 多分支练习
 */

import java.util.Scanner;
public class IfElse02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("输入信用分");
		double creditScore = myScanner.nextDouble();
		if(creditScore <= 100.0){
			if(creditScore == 100.0) {
				System.out.println("信用极好");
//				条件表达式 使用多个判断符号时 必须要用多个表达式 不能 80 < creditScore <= 99 这样表达
//				表达式与表达式之间也需要用 && 连接起来
			}else if(80.0 < creditScore && creditScore <= 99.9) {
				System.out.println("信用优秀");
			}else if(60.0 <= creditScore && creditScore <= 80.0) {
				System.out.println("信用一般");
			}else {
				System.out.println("信用不及格");
			}
		}else {
			System.out.println("不可输入大于100的参数进行判断");
		}
		System.out.println("判断结束 程序继续");
	}
}
