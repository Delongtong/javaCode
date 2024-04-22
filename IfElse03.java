/**
 * 多层嵌套
 */
import java.util.Scanner;
public class IfElse03{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
//		先判断男女性别逻辑会更好一点 但代码行数会增加
		System.out.println("输入初赛成绩");
		double score = myScanner.nextDouble();
		if(score > 8.0) {
			System.out.println("输入你的性别");
			char gender = myScanner.next().charAt(0);
			if(gender == '男') {
				System.out.println("进入下一轮男子组比赛");
			}else if(gender == '女'){
				System.out.println("进入下一轮男子组比赛");
			}else {
				System.out.println("输入有误 需输入男或女进行分组");
			}
		}else {
			System.out.println("你已被淘汰");
		}
		System.out.println("判断结束 程序继续");
	}
}
