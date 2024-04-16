/**
 * 
 * @author tongdelong
 *
 *||短路或 两个判断语句只要有一个为true 结果为true 否则为false 执行逻辑为 第一条语句为true时 不会继续执行后面语句 如果第一条语句为false 才会执行后面语句
 *｜逻辑或 两个判断语句只要有一个为true 结果为true 否则为false 执行逻辑为 不管第一条语句为true还是false 都会执行后面语句
 *开发时使用短路或时较多
 */

public class LogicOperator02{
	public static void main(String[] args) {
		
		int Age = 1;
		int Num = 2;
//		if(Age < 0 || --Num < 10) {
//			System.out.println("okok");//其中一条语句为true 所以会输出okok
//		}
//		System.out.println("Age = " + Age + "\n" + "Num = " + Num);//第一条语句结果为false 所以继续执行后面语句中--Num Num值为1
		
//		if(Age > 0 || Num-- > 10) {
//			System.out.println("okok");//两条语句都为false 所以不会输出okok
//		}
//		System.out.println("Age = " + Age + "\n" + "Num = " + Num);//第一条语句结果为true 所以继续不会执行后面语句中Num-- Num值依然为2
		
//		if(Age < 0 | --Num < 10) {
//		System.out.println("okok");//其中一条语句为true 所以会输出okok
//		}
//		System.out.println("Age = " + Age + "\n" + "Num = " + Num);//不管第一条语句为false或者true 都会继续执行后面语句中--Num Num值为1
		
		if(Age < 0 || Num-- > 10) {
			System.out.println("okok");//两条语句都为false 所以不会输出okok
		}
		System.out.println("Age = " + Age + "\n" + "Num = " + Num);//不管第一条语句为false或者true 都会继续执行后面语句中--Num Num值为1
		
	}
}