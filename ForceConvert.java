//强制类型转换  手动有意识转换
public class ForceConvert{
	public static void main(String[] args) {
		
		int A = (int)1.9; 
		System.out.println("A = " + A);
		
		int B = 2000;
		byte B1 = (byte)B;
		System.out.println("B = " + B1);
	}
}