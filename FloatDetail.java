public class FloatDetail{
	public static void main(String[] args) {
		float A = 1.1F;
		double A1 = 9.2F;
		float A2 = .09F;
		System.out.println(A2);
		System.out.println(5.12E2F);
		System.out.println(5.12e-2F);
		
		double B = 1.123123123123;
		float B1 = 2.243321423423F;
		System.out.println(B);
		System.out.println(B1);
		
		double C = 2.7;
		double C1 = 8.1 / 3;//数学计算后等于2.7 
		double C2 = 2.7;
		System.out.println(C2);
//		System.out.println(C);
//		System.out.println(C1);
//		直接赋值比较
		if(C == C2) {
			System.out.println("xiangdeng");
		}else {
			System.out.println("buxiangdeng");
		}
//		计算后比较 C =！ C1
		if(Math.abs(C - C1) < 0.000001) {
			System.out.println("xiangdeng");
		}else {
			System.out.println("buxiangdeng");
		}
		System.out.println(Math.abs(C - C1)) ;
	}
}