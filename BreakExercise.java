/**
 * break细节
 * @author tongdelong
 *
 */
import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args) {
		
//     	//1-100的和 当和第一次大于或等于20时 退出循环
//		int start = 1;
//		int end = 100;
//		int sum = 0;
//		int breakNum = 20;
//		for(int i = start; i <= end; i++) {
//			sum += i;
//			if(sum > breakNum || sum == breakNum) {
//				System.out.println("i当前数是" + i);
//				break;
//			}
//		}
//		System.out.println(sum);
		
		//登录验证 3次机会 
		Scanner myScanner = new Scanner(System.in);
		int loginChance = 2;
		String name = " ";
		String password = " ";
		for(int i = loginChance; i >= 0; loginChance--) {
			System.out.println("输入用户名");
			name = myScanner.next();
			System.out.println("输入密码");
			password = myScanner.next();
			if("Deron".equals(name) && "20010918".equals(password)) {
				System.out.println("登录成功");
				break;
			}else if(loginChance == 0){
				System.out.println("错误次数已达上限 10分钟后再试");
				break;
			}else {
				System.out.println("用户名或密码错误 还有" + loginChance + "次机会请重试");
			}
		}
		System.out.println("登陆循环退出");
		
	}
} 