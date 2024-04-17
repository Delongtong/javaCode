/**
 * 
 * @author tongdelong
 *
 *!取反 判断语句为true时 结果为false， 判断结果为false 结果为true
 *^逻辑异或 两个语句判断结果都为true或false（结果相同）时 结果为false， 两个判断语句一条为true 另条为false（结果不相同）时 结果为true
 */


public class InverseOperator{
	public static void main(String[] args) {
		
		System.out.println(5 > 3);//true
		System.out.println(!(7 != 1));//取反 false
		
		boolean A = (8 == 1) ^ (9 < 1);
		System.out.println(A);//两条语句都为false 判断结果相同 输出结果为false
		
		boolean B = (8 != 1) ^ (9 < 1);
		System.out.println(B);//两条语句一条为false 一条为true 判断结果不相同 输出结果为true
		
	}
}