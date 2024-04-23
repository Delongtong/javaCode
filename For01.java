/**
 * 
 * @author tongdelong
 *for循环执行规则 第一步先执行变量初始化语句 第二步执行判断语句（boolean表达式） 第三步执行循环语句 第四步循环变量迭代 
 *for循环格式for(;;){可以是多条输入语句 也可以是单条}
 */
public class For01{
	public static void main(String[] args) {
	
		
//		执行int i = 1；判断i是否小于等于10 判断结果为true 执行输出语句i 再执行i++ 赋给int i = 1 此时i=2 
//		再次重复执行判断 直到boolean表达式为false 循环结束 程序继续
	for(int i = 1; i <= 10; i++) {
		System.out.println(i);
	}	
	System.out.println("循环结束");	

	}
}