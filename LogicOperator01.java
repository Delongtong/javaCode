/**
 * 
 * @author tongdelong
 *
 *逻辑运算符使用
 *&逻辑与   两个条件都为true，结果为true，否则false 执行逻辑是 不管第一条判断语句为false还是true 后面语句依然执行判断
 *&&短路与  两个条件都为true，结果为true，否则false 执行逻辑是 第一条判断语句为true 后面语句才会执行 如果第一条判断语句为false 后面语句不再执行判断  
 *开发时使用短路与时较多
 */
public class LogicOperator01{
	public static void main(String[] args) {
		
		int Age = 50;
		int Num = 90;	
//		if(Age > 2 && Num++ < 100 ) {
//			System.out.println("ok");//两条判断语句都为true 所以会输出ok
//		}
//		System.out.println("Age = " + Age + "\n" + "Num = " + Num);//第一条判断语句为true 后面语句则继续执行判断 所以执行Num++ Num值为91
		
//		if(Age < 2 & ++Num < 100) {
//			System.out.println("okok");//其中一条判断语句为false 所以不会输出okok
//		}
//		System.out.println("Age = " + Age + "\n" + "Num = " + Num);//不管第一条判断语句为true或者false 后面语句依然执行 Num值为91
		
//		if(Age < 2 && ++Num < 100) {
//			System.out.println("okok");//其中一条判断语句为false 所以不会输出okok
//		}
//		System.out.println("Age = " + Age + "\n" + "Num = " + Num);//第一条判断语句为false 后面语句不会执行 所以不执行++Num Num值依然为90
		
		if(Age > 2 & ++Num < 100) {
		System.out.println("okok");//两条判断语句都为true 所以会输出okok
		}
		System.out.println("Age = " + Age + "\n" + "Num = " + Num);//不管第一条判断语句为true或者false 后面语句依然执行 Num值为91
	}
}