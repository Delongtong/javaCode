/**
 * 
 * @author tongdelong
 *章节练习
 */
import java.util.Scanner;
public class Exercise001{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
//		//1.Hello word
//		System.out.println("Hello Word");
		
		//2.个人信息
//		System.out.println("姓名" + "\t" + "性别" + "\t" + "籍贯" + "\t" + "住址" + "\n" + "***" + 
//		"\t" + "*" + "\t" + "**" + "\t" + "**");
//		System.out.print("姓名\t性别\t籍贯\t住址\n**\t*\t**\t**");
		
		//3.String 转换int类型 
//		String str = "1";
//		int A = Integer.parseInt(str);
//		System.out.println(A);
//		String AAA = A + "";
//		System.out.println(AAA);
		
		//4.转换
//		char int long float double
//		byte short int long float double
		
		//*5.逻辑运算
//		逻辑与 & 两个判断都为true 结果为true 否则结果为flase 执行逻辑是 不管第一个判断为true还是flase都会执行第二个判断
//		短路与 && 两个判断都为true 结果为true 否则结果为flase 执行逻辑是 第一个判断为flase时 就不会再去执行第二个判断
//		逻辑或 ｜ 两个判断有一个为true 结果为true 否则结果为flase 执行逻辑是 不管第一个判断为true还是flase都会执行第二个判断
//		短路或 ｜｜ 两个判断有一个为true 结果为true 否则结果为flase 执行逻辑是 第一个判断为true时 就不会执行第二个判断 
//					如果第一个结果为flase时才会去执行第二个判断
//		取反 ！ 如果判断是true 取反结果就为flase 如果判断是flase 取反结果就是true 
//		逻辑异或 ^ 两个判断一个为true另一个为flase时（不同） 结果为true  如果两个判断一个都为true或者都为flase（相同） 结果就为flase
//		三元运算符 （判断）？num1 ： num2； 判断为true 就会把判断值赋给num1 判断为flase 则把判断值赋给num2
		
		//*6.char String转换
//		String str = "23";
//		char Num = str.charAt(1);
//		System.out.println(Num);
		
		//7.还有59天放假 合xx星期xx天
//		int sum = 59;
//		int week = sum / 7;
//		int days = sum % 7; 
//		System.out.println(sum + "天合" + week + "星期零" + days + "天");
//		System.out.println("===================================");
//		int sum = 56;
//		int weeks = sum / 7; // 计算总共有几个星期
//		int remainingDays = sum % 7; // 计算剩余的天数
//
//		String result = sum + "天合";
//		if (weeks > 0) {
//		    result = result + weeks + "个星期";
//		}
//		if (remainingDays > 0) {
//			result = result + remainingDays + "天";
//		}
//		System.out.println(result);
		
		//*8.华氏度对应的摄氏度
//		double huashi = 234.5;
//		double sheshi = 5.0 / 9 * (huashi - 100);
//		System.out.println(huashi + "华氏度对应的是" + sheshi + "摄氏度");
		
		//9.声明两个double类型 判断满足条件时 打印两数之和
//		double num1 = 11.1;
//		double num2 = 1323.0;
//		if(num1 > 10.0 && num2 < 20.0) {
//			System.out.println("两数之和是" + (num1 + num2));
//		}else {
//			System.out.println("不满足计算条件");
//		}
		
		//10.声明两个int类型 判断两数之和是否能被3和5整除 打印信息
//		int num1 = 10;
//		int num2 = 55;
//		int sum = num1 + num2;
//		if(sum % 3 == 0 && sum % 5 == 0) {
//			System.out.println("满足条件");
//		}else {
//			System.out.println("不满足条件");
//		}
		
		//11.判断年份是否为闰年
//		int year = 2001;
//		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//			System.out.println(year + "年是闰年");
//		}else {
//			System.out.println(year + "年不是闰年");
//		}
		
		//12.输入信用参数判断信用等级
//		System.out.println("输入信用分");
//		double sroce = myScanner.nextDouble();
//		if(sroce >= 1 && sroce <= 100) {
//			if(sroce == 100) {
//				System.out.println("极好");
//			}else if(sroce > 80 && sroce <= 99) {
//				System.out.println("优秀");
//			}else if(sroce >= 60 && sroce <= 80) {
//				System.out.println("一般");
//			}else {
//				System.out.println("不及格");
//			}
//		}else {
//			System.out.println("参数错误");
//		}
		
		//13.根据月份年龄判断票价
//		int price = 60;
//		System.out.println("输入当前月份");
//		byte month = myScanner.nextByte();
//		if(month >= 4 && month <= 10) {
//			System.out.println("输入年龄");
//			int age = myScanner.nextInt();
//			if(age >= 18 && age <= 60) {
//				System.out.println("票价" + price);
//			}else if(age < 18 && age >= 1) {
//				System.out.println("票价" + (price / 2));
//			}else{
//				System.out.println("票价" + (price * 1 / 3));
//			}
//		}else {
//			System.out.println("输入年龄");
//			int age = myScanner.nextInt();
//			if(age >= 18) {
//				System.out.println("票价" + 40);
//			}else {
//				System.out.println("票价" + 20);
//			}
//		}
//		//优化点很多
		
		//14.char类型小写字母转换为大写 switch
//		System.out.println("输入要转换的字母 a-e");
//		char num = myScanner.next().charAt(0);
//		switch(num) {
//			case 'a':
//				 System.out.println("A");
//				 break;
//			case 'b':
//				 System.out.println("B");
//				 break;
//			case 'c':
//				 System.out.println("C");
//				 break;
//			case 'd':
//				 System.out.println("D");
//				 break;
//			case 'e':
//				 System.out.println("E");
//				 break;
//			default:
//				System.out.println("other");
//		}
		
		//*15.对学生成绩 进行判断 打印结果 成绩不能大于100 switch
//		System.out.println("输入成绩");
//		double score = myScanner.nextDouble();
//		if(score >= 0 && score <= 100) {
//			switch((int)(score / 60)) {
//				case 0:
//					System.out.println("不合格");
//					break;
//				case 1:
//					System.out.println("合格");
//			}
//		}else {
//			System.out.println("成绩无效");
//		}
		
		//16.输入月份 打印月份所属季节
//		System.out.println("输入月份");
//		byte month = myScanner.nextByte();
//		switch(month) {
//			case 12:
//			case 1:
//			case 2:
//				System.out.println("冬季");
//				break;
//			case 3:
//			case 4:
//			case 5:
//				System.out.println("春季");
//				break;
//			case 6:
//			case 7:
//			case 8:
//				System.out.println("夏季");
//				break;
//			case 9:
//			case 10:
//			case 11:
//				System.out.println("秋季");
//				break;
//			default:
//				System.out.println("输入1-12月份参数");
//		}
		
		//17.打印1-100之间所有是9的倍数的整数 统计个数及总和
//		int count = 0;
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 9 == 0) {
////				if(count % 5 == 0) {
////					System.out.println();
////				}
//				System.out.print(i + "\t");
//				count++;
//				sum += i;
//			}
//		}
//		System.out.println();
//		System.out.println("9的倍数有" + count + "个");
//		System.out.println("9的倍数的总和是" + sum);
		
		//18.打印公式
//		int num = 5;
//		for(int i = num; i >= 0; i--) {
//			System.out.println((num - i) + " + " + i + " = " + num);
//		}
		
		//19.打印1-100之间所有能被3整除的数 while
//		int i = 1;
//		while(i <= 100) {
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//20.打印40-200之间所有的偶数 while
//		int i = 40;
//		while(i <= 200) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//21.do while 打印1-100 以及总和
//		int sum = 0;
//		int i = 1;
//		do {
//			System.out.println(i);
//			sum += i;
//			i++;
//		}while(i <= 100);
//		System.out.println(sum);
		
		//22.1-200之间能被5整除不能被3整除的个数
//		int count = 0;
//		int i = 1;
//		do {
//			if(i % 5 == 0 && i % 3 != 0) {
//				count++;
//			}
//			i++;
//		}while(i <= 200);
//		System.out.println(count);
		
		//23.输出特定时 循环结束
//		char anwer = ' ';
//		do {
//			System.out.println("end?");
//			anwer = myScanner.next().charAt(0);
//			if(anwer == 'y') {
//				break;
//			}
//		}while(true);
		
		//24.99乘法表
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
//			}
//			System.out.println();
//		}
		
		//**25.统计3个班成绩 每班5名同学 求出各个班平均分和所有班级的平均分 成绩键盘输入 统计及每班及格人数以及年级及格人数
//		int classCount = 3;
//		int classSize = 5;
//		int allClassPassSize = 0;
//		double allClassScore = 0;
//		for(int i = 1; i <= classCount; i++) {
//			double classScore = 0;
//			int classPassSize = 0;
//			for(int j = 1; j <= classSize; j++) {
//				System.out.println("输入" + i + "班第" + j + "个学生的成绩");
//				double score = myScanner.nextDouble();
//				if(score >= 5) {
//					classPassSize++;
//				}
//				classScore += score;
//			}
//			allClassScore += classScore;
//			allClassPassSize += classPassSize;
//			System.out.println(i + "班成绩总分为" + classScore + "分");
//			System.out.println(i + "班平均分为" + classScore / classSize + "分");
//			System.out.println(i + "班及格人数为" + classPassSize + "人");
//		}
//		System.out.println(classCount + "个班级总成绩为" + allClassScore + "分");
//		System.out.println(classCount + "个班级总成绩的平均分为" + (allClassScore / classCount) + "分");
//		System.out.println(classCount + "个班级及格人数一共有" + allClassPassSize + "个");
//		System.out.println(classCount + "个班级所有学生的总成绩的平均分为" + (allClassScore / (classCount * classSize)) + "分");
		
		//**26.有100000 大于50000每次少5% 小于等于50000少1000 100000可以循环多少次 要求while break
//		double sum = 100000;
//		int count = 0;
//		while(true){
//			if(sum > 50000){
//				sum *= 0.95;
//				count++;
//			}else if(sum >= 1000) {
//				sum -= 1000;
//				count++;
//			}else {
//				break;
//			}
//		}
//		System.out.println("可以循环" + count + "次");
		
		//27.判断一个整数 属于哪个范围 大于0 小于0 等于0
//		int num = 9;
//		if(num > 0) {
//			System.out.println(num + "大于0");
//		}else if(num < 0) {
//			System.out.println(num + "小于0");
//		}else {
//			System.out.println(num + "等于0");
//		}
		
		//28.判断年份是否为闰年
//		int years = 2001;
//		if((years % 400 == 0) || (years % 4 == 0 && years % 100 != 0)) {
//			System.out.println(years + "年是闰年");
//		}else {
//			System.out.println(years + "年不是闰年");
//		}
		
		//29.判断一个整数是否为水仙花数
//		for(int num = 100; num <= 999; num++) {
//			int num1 = num / 100;
//			int num2 = num / 10 % 10;
//			int num3 = num % 10;
//			if(num == num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3) {
//				System.out.println(num + "是水仙花数");
//			}else {
//				continue;
//			}
//		}

		//30.输出1-100之间的不能被5整除的数 每5个一行
//		int count = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 5 != 0) {
//				System.out.print(i + "\t");
//				count++;
//				if(count % 5 == 0) {
//					System.out.println();
//				}
//			}
//		}
		
		//31.输出小写的a-z 以及大写的Z-A
//		for(char i = 'a'; i <= 'z'; i++) {
//			System.out.print(i + "\t");
//		}
//		System.out.println();
//		for(char j = 'Z'; j >= 'A'; j--) {
//			System.out.print(j + "\t");
//		}
		
		//***32.求出1-1/2+1/3-1/4...1/100的和
//		double sum = 0;
//		double i = 1.0;
//		for(int j = 1; j <= 100; j++) {
//			if(j % 2 != 0) {
//				sum += i / j;
//			}else {
//				sum -= i / j;
//			}
//		}
//		System.out.println(sum);
		
		//***33.求1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + 3 + ... + 100)的结果
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			for(int j = 1; j <= i; j++) {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
	}
}