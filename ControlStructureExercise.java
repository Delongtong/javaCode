/**
 * 
 * @author tongdelong
 *
 *控制结构部分练习
 *拆解分析 化繁为简 
 *找到规律点 逻辑点 
 *用到/时注意类型的使用 double类型 会不会结果的精度不够
 *判断条件时 多思考下条件意义
 */
public class ControlStructureExercise{
	public static void main(String[] args) {
		
//		1某人有100,000元 每经过一次路口 需要缴费 大于50000时 每次交5% 小于等于50000 每次交1000 计算可以经过多少次路口（while break）
//		int count = 0;
//		double balance = 100000;
//		while(balance > 0) {
//			if(balance > 50000) {
////				balance = balance - (balance * 0.05);//每一次交这么多钱
//				balance *= 0.95;//每一次剩这么多钱
//				count++;
////				System.out.println(balance + "大于50000时" + count);
//			//大于等于50000没有意义可不写
//			}else if(balance <= 50000 && balance >= 1000) {
//				balance -= 1000;
//				count++;
////				System.out.println(balance + "小于等于50000时" + count);
//			}else{
//				break;
//			}
//		}
//		System.out.println("100000块一共可以经过" + count + "次路口");
		
//		2实现判断一个整数 属于哪个范围 大于0 小于0 等于0
//		int num1 = -10;
//		if(num1 > 0) {
//			System.out.println("该参数大于0");
//		}else if(num1 < 0) {
//			System.out.println("该参数小于0");
//		}else {
//			System.out.println("该参数等于0");
//		}
		
//		3判断一个年份是否为闰年
//		int years = 2001;
//		if(years % 400 == 0 || (years % 4 == 0 && years % 100 != 0)) {
//			System.out.println(years + "年是闰年");
//		}else {
//			System.out.println(years + "年不是闰年");
//		}
		
//		4判断一个整数是否是水仙花数 指一个3位数 其各个位上数字立方和等于其本身 eg：153 = 1*1*1 + 3*3*3 + 5*5*5
//		int n = 153;
//		int n1 = n / 100;//得到百位
//		int n2 = n % 100 / 10;//得到十位
//		int n3 = n % 10;//得到个位
//		if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n) {
//			System.out.println(n + "是水仙花数");
//		}else {
//			System.out.println(n + "不是水仙花数");
//		}
////		System.out.println(n1);
////		System.out.println(n2);
////		System.out.println(n3);
		
//		5下方代码输出什么
//		class Demo{
//			public static void main(String[] args) {
//				int m = 0,n = 3;
//				if(m > 0) {//表达式为flase 不会进入if语句 所以不会输出任何结果
//					if(n > 2) {
//						System.out.println("ok1");
//					}else {
//						System.out.println("ok2");
//					}
//				}
//			}
//		}
		
//		6输出1-100之间的不能被5整除的数，每5个一行
//		int count = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 5 != 0) {
//				System.out.print(i + "\t");//使用字标位对齐
//				count++;
//				if(count % 5 == 0) {
//					System.out.println();
//				}
//			}
//		}
		
//		7输出小写的a-z以及大写的Z-A  ASCII表 + for
		//自己先做
//		char num = 'a';//a = 97
//		for(int i = 0; i <= 25; i++) {//字母一共26位 循环26次
//			System.out.print((char)(num + i) + " "); //'a' + 1 = 98 98就是b +2就是c 以此类推到z 再强制转换char类型得到b
//		}
//		System.out.println();
////		同小写逻辑
//		char num1 = 'Z';
//		for(int j = 0; j <= 25; j++) {
//			System.out.print((char)(num1 - j) + " ");
//		}
//		System.out.println();
//		//优化
//		for(char c1 = 'a'; c1 <= 'z'; c1++) {
//			System.out.print(c1 + " ");
//		}
//		System.out.println();
//		for(char c2 = 'Z'; c2 >= 'A'; c2--) {
//			System.out.print(c2 + " ");
//		}
		
//		8求出1-1/2+1/3-1/4...1/100的和 for + if
//		double j = 1.0;
//		double sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				sum -= j / i;
//			}else {
//				sum += j / i;
//			}
//		}
//		System.out.println(sum);
		
//		9求1+（1+2）+（1+2+3）+（1+2+3+4）+...+（1+2+3+...+100）的结果 多重循环for
		int sum = 0;
//		int sum1 = 0;
		for(int i = 1; i <= 100; i++) {
//			sum1 = 0;
			for(int j = 1; j <= i; j++) {
				sum += j;
			}
//			sum += sum1;
		}
		System.out.println(sum);
	}
}