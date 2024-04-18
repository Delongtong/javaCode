/**
 * 
 * 
 * @author tongdelong
 *
 * 接收用户输入Scanner
 */
import java.util.Scanner;//导入Scanner所在的包中的Scanner类
public class Input{
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);//创建Scanner类对象
		System.out.println("请输入姓名");
		String Name = myScanner.next();//接收输入的String类型字符串
		System.out.println("请输入年龄");
		byte Age = myScanner.nextByte();//接收输入的byte类型字符
		System.out.println("请输入成绩");
		double sal = myScanner.nextDouble();//接收输入的double类型字符
		System.out.println("个人信息如下" + "\n" + "姓名" + "\t" + "年龄" + "\t" + "成绩" 
		+ "\n" + Name + "\t" + Age + "\t" + sal);//输出输入的信息
		
		
	}
}