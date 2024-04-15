public class HomeWork02{
	public static void main(String[] args) {
		//1
		char A = '\t';
		char A1 = '\n';
		char A2 = '\r';
		char A3 = '\\';
		char A4 = '1';
		char A5 = '2';
		char A6 = '3';
		System.out.println(A);
		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		System.out.println(A4);
		System.out.println(A5);
		System.out.println(A6);
		//2
		String B = "三体";
		String B1 = "相对论";
		System.out.println(B + B1);
		
		char B4 = '串';
		char B3 = '男';
		System.out.println(B4);
		System.out.println(B4 + B3);//相加自动转换成int类型
		
		float B5 = 32.2F;
		double B6 = 55.1;
		double B7 = B5 + B6;
		System.out.println(B7);
		
		//3
		String Name = "Deltong";
		byte Age = 22;
		double Sorce = 97.2;
		char Gender = '男';
		String Hobby = "バスケ";
		//用\n实现换行 \t实现空格
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好" + "\n" + Name + "\t" + Age + "\t" + Sorce + "\t" +
				Gender + "\t" + Hobby);
		
	}
}