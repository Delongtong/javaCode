public class ArithmeticOperator01{
	public static void main(String[] args) {
		
		int I = 1;
//		I = I++;//赋值给自身时 规则会使用一个临时变量 有三个步骤 （1）临时变量 = I; （2）I = I + 1; （3）I = 临时变量
//		System.out.println(I);// 所以I = 1
		I = ++I;//前++ 先运算（1）I = I + 1; （2）临时变量 = I; （3）I = 临时变量
		System.out.println(I);//所以 I = 2
		
		int i = 10;
		int j = 20;
		int i1 = i++;
		System.out.println("i1 = " + i1);//10  i = 11;
		System.out.println("j = " + j);//20
		i1 = --j;
		System.out.println("i1 = " + i1);//19
		System.out.println("j = " + j);//19
		
	}
}