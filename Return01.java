/**
 * 
 * @author tongdelong
 *return 同break也是跳出 但不同的是break是跳出循环 循环外程序依然会继续 而return是直接跳出方法 如果是主方法 循环外程序不会执行 会直接退出程序
 */
public class Return01{
	public static void main(String[] args) {
		
		for(int i = 1; i < 5; i++) {
			if(i == 3) {
//				break;//i等于3时退出循环 会输出循环外程序语句
//				continue;//i等于3时 跳过3的这次循环 继续执行循环 直到循环退出 执行循环外程序语句
				return;//i等于3时退出该方法 该方法是主方法（main）所以不会执行循环外的程序语句 会直接退出程序
			}
			System.out.println("循环语句" + i);
		}
		System.out.println("循环外程序语句");//循环结束后i等于5
		
	}
}