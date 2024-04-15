//强制转换细节
public class ForceConvertDetail{
	public static void main(String[] args) {
		
//		int X = (int)10*3.3*9*2.2;错误转换符号只对最近的数字有效
		int Y = (int)(10*3.3*9*2.2);
		System.out.println(Y);
		
		char A = 100;
		int B = 100;
//		char C = B;//错误B类型 比C类型精度高
		char D = (char)B;
		System.out.println(D);
		
		//练习
		byte E = 9;
//		E = E - 1;//数字表达式 没写类型的话 默认为int
		
	}
}