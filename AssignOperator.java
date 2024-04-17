/**
 * 
 * @author tongdelong
 *赋值运算符练习
 */

public class AssignOperator{
	public static void main(String[] args) {
		
		int Num1 = 10 ;
		Num1 += 11 ;
		System.out.println(Num1);//21
		Num1 /= 4;
		System.out.println(Num1);//保留整数5
		
		int Num2 = Num1 + 1 + 2;//计算顺序 先计算右面Num1 + 1 + 2 再把值赋给Num2
		System.out.println(Num2);//8
		
		byte Num3 = 2;
//		Num3 = Num3 + 1;会报错 1为int类型
		Num3 += 1.1F;//正确 等价于Num3 = byte(Num3 + 1.1); 因为复合赋值运算符底层把1.1的float类型强制类型转换成byte类型 精度下降
		Num3++;//强制转换逻辑同上行
		System.out.println(Num3);//4
	}
}