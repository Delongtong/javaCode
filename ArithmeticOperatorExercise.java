public class ArithmeticOperatorExercise{
	public static void main(String[] args) {
		
		int Days = 59;
		int Weeks = Days / 7;//星期
		int leftDays = Days % 7;//天
		System.out.println(Days + "天合" + Weeks + "个星期零" + leftDays + "天");
		
		double huashi = 234.5F;
//		double sheshi = 5 / 9 * (C - 100);//错误 5 / 9为int类型 结果不会保留小数点后的数字 华氏度值无论是多少 结果都会是0 把5或者9变为double类型即可
		double sheshi = 5 / 9.0 * (huashi - 100);
		System.out.println("华氏温度" + huashi + "对应的摄氏度为" + sheshi);
		
	}
}