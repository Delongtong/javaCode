/**
 * 
 * @author tongdelong
 *for循环细节
 *
 */
public class ForDetail{
	public static void main(String[] args) {
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}	
//		System.out.println(i);//错误 i在for循环中时 只能再循环中使用 不能在循环外使用
	
//		变量i也可以写在外面 因为符合执行顺序 且for循环（）内要保留分号；
//		好处为i在for循环外 也可以被使用
		//1
//		int i = 1;
//		//2
//		for( ;i <= 10;) {
//			//3	
//			System.out.println("循环第" + i + "次");
//		    //4
//			i++;
//		}	
//		System.out.println("循环执行结束后i = " + i);//i = 11 循环执行结束后i一定是等于11的	
		
//		for(;;) {
//			System.out.println("这样写的话就表示 该for循环将会无限循环");
//		}//项目中有可能搭配break以及...使用 不会单独使用
		
		int Num1 = 3;
		int Num2 = 3;
//		循环初始值可以为一个也可以为多个 中间要使用逗号隔开 
//		循环变量迭代可以为一个也可以为多个 中间要使用逗号隔开
		int i = 0,j = 0;
		for(; i < Num1 && j < Num2; ++i,j += 2) {
			System.out.println("循环中 i = " + i + " j = " + j);
		}
		System.out.println("循环结束后 i = " + i + " j = " + j);//i = 2 j = 4
		
	}
}