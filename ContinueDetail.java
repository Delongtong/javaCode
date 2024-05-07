/**
 * 
 * @author tongdelong
 *continue 细节 
 *多重循环时 continue作用体现
 */
public class ContinueDetail{
	public static void main(String[] args) {
		
		
		A://外层循环标识
		for(int i = 0; i < 2; i++) {
			A1://内层循环标识	
			for(int j = 0; j < 10; j++) {
				if(j == 2) {
					//continue后加上循环层级标识同break逻辑 continue在这里的作用 只是每次循环不输出指定数2 终止的只是本次循环 依然判断下一次循环是否继续进行
					//而break作用是遇到指定数2会直接结束循环 不会再去继续判断循环条件 程序继续
					continue;//等价于continue A1;会输出2次 [0 1 3 4 5 6 7 8 9]
//					continue A;//会输出2次 [0 1]
				}
				System.out.println(j);
			}
		}
		
	}
}