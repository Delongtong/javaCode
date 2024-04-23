/**
 * 
 * For练习
 * @author tongdelong
 *需求化繁为简 拆解分析
 *程序先死后活 先做出来再去优化
 */
public class ForExercise{
	public static void main(String[] args) {
		
//		int Num1 = 0;//统计个数
//		int Sum1 = 0;//统计倍数的和
//		//尽量把程序里的常量 在循环外定义为变量 方便后面迭代（常量变化）
//		int Start = 1;
//		int End = 100;
//		int Num2 = 9;
//		for(int i = Start; i <= End; i++) {
//			if(i % Num2 == 0) {
//				System.out.println(i + "是9的倍数");
//				Num1++;
//				Sum1 += i;
//			}
//		}
//		System.out.println("1 ～ 100之间9的倍数有" + Num1 + "个");	
//		System.out.println("1 ～ 100之间9的倍数相加的和是" + Sum1);
		
//		for(int i = 0; i <= 0; ) {
//			for(int j = 5; j > 0; --j) {
//				System.out.println((i) + "+" + (j) + "=" + (i + j));	
//				++i;
//			}
//		}
//		int Num3 = 5;
//		for(int i = 0; i <= Num3; i++) {
//			System.out.println(i + "+" + (Num3 - i) + "=" + Num3);
//		}
		for (int i = 0, j = 5; i <= 5 && j >= 0; ++i, --j) {
		    System.out.println((i) + "+" + (j) + "=" + (i + j));
		      
		}
	}
}