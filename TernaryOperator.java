/**
 * 
 * 
 * @author tongdelong
 *
 *三元运算符 条件表达式？表达式1:表达式2  条件表达式为true 执行表达式1 如果条件表达式为false 则执行表达式2
 */
public class TernaryOperator{
	public static void main(String[] args) {
		
//		int A = 10;
//		int B = 11;
//		int C = A < B ? A++ : B++;//条件表达式为true 执行表达式1
//		System.out.println(C + "\t" + A + "\t" + B);//A先赋值给C 再计算+1 所以C=10 A=11 B=11
		
//		int A = 10 , B = 11;
//		int C = A > B ? A++ : ++B;//条件表达式为false 执行表达式2
//		System.out.println(C + "\t" + A + "\t" + B);//B先计算+1 再赋值给C 所以C=12 A=10 B=12

/**
 * 
 * 三元运算符使用细节
 * 
 */
		//表达式1和表达式2要使用可以赋给接收变量的类型 也可以使用自动转换或强制转换
		int Num1 = 2 , Num2 = 3;
//		double Num3 = Num1 > Num2 ? Num1++ : --Num2;//正确 类型精度满足
////		int Num3 = Num1 > Num2 ? 2 : 1.1;//错误 类型精度错误 可以int(1.1)进行强制转换 或者改变int类型改成double数据类型来接收
//		System.out.println(Num1 + "\t" + Num2 + "\t" + Num3);
		
		int Num3 = Num1 > Num2 ? Num1++ : --Num2;
//		上方三元运算公式 等价于下面的if else语句
		if(Num1 > Num2)Num3 = Num1++;
		else Num3 = --Num2;
	
/**
 * 
 * 	练习	
 */
		
		int N = 11 , N2 = 22 , N3 = 33;
		int maxNum1 = N > N2 ? N : N2;//比较出N N1两个的最大数 存到maxNum1
		int maxNum2 = maxNum1 > N3 ? maxNum1 : N3;//比较出maxNum1 N3两个的最大数 存到maxNum2 得出最大数
		System.out.println("最大数为" + maxNum2);
		
	}
}