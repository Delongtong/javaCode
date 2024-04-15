/**
 * 
 * @author tongdelong
 * 算数运算符
 */

public class ArithmeticOperator{
	public static void main(String[] args) {
		
		System.out.println(10 / 4);//int精度只能保留整数 结果为2
		System.out.println(10.0 / 4);//2.5
		double D = 10 / 4;//虽然是double类型 但是10依然是int类型赋给double类型 精度会提升 但结果依然为2.0 非2.5
		System.out.println(D);
		System.out.println("======================================");
		//%本质是 a % b = a - a / b * b
		System.out.println(10 % 3);//1 10 - 10 / 3 * 3 = 1
		System.out.println(-10 % 3);//-1  -10 - (-10) / 3 * 3 = -1 
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1
		System.out.println("======================================");
		//++ 独立语句使用
		int I = 10;
		I++;
//		++I; 作为独立语句使用 前++ 和 后++ 都等价于 int I = I + 1;
		System.out.println("I = " + I);//11
		// ++ 表达式使用
		int A = 10;
		int B = A++;//后++ 先赋值再运算 B = A; A = A + 1; 
		System.out.println("A = " + A + "\t" + "B = " + B);//A = 11 B = 10
//		int B = ++A;//前++ 先运算后赋值 A = A + 1; B = A; 
//		System.out.println("A = " + A + "\t" + "B = " + B);//A = 11 B = 11
		//--语法规则同上面++
		
	}
}