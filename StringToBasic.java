public class StringToBasic{
	public static void main(String[] args) {
		
		int A = 1;
		float A1 = .1F;
		double A2 = .98;
		boolean A3 = true;
		String B = A + "";
		String B1 = A1 + "";
		String B2 = A2 + "";
		String B3 = A3 + "";
		System.out.println(A + "" + A1 + "" + A2 + "" + A3 + "");
		
		String C = "123";
//		String CC = "hello"; 不用使用数字之外变量转成int类型
		int C1 = Integer.parseInt(C);
		double C2 = Double.parseDouble(C);
		float C3 = Float.parseFloat(C);
		byte C4 = Byte.parseByte(C);
		boolean C5 = Boolean.parseBoolean("True");
		short C6 = Short.parseShort(C);
		long C7 = Long.parseLong(C);
		System.out.println("====================================");
		System.out.println(C5);
		System.out.println(C);
		System.out.println(C1 + 1.1);
		System.out.println(C2);
		System.out.println(C3);
		System.out.println(C4);
		System.out.println(C6);
		System.out.println(C7);
		System.out.println(C.charAt(0));
		
//		String str = "asd";
//		int D = Integer.parseInt(str);
//		System.out.println(D);错误
		
		
	}
}