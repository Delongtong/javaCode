/**
 * do while
 * @author tongdelong
 *
 */
public class DoWhile01{
	public static void main(String[] args) {
		
		int Num1 = 6;
		do{
			System.out.println(Num1);//会输出6 do while会先执行一次输出语句后 然后再执行判断语句
			Num1++;
		}while(Num1 <= 5);
		System.out.println(Num1);//循环结束 Num1 = 7
		
	}
}