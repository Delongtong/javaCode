/**
 * 
 * @author tongdelong
 *章节练习
 */
import java.util.Scanner;
public class MainDifficulty{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		
		//*逻辑运算
//		逻辑与 & 两个判断都为true 结果为true 否则结果为flase 执行逻辑是 不管第一个判断为true还是flase都会执行第二个判断
//		短路与 && 两个判断都为true 结果为true 否则结果为flase 执行逻辑是 第一个判断为flase时 就不会再去执行第二个判断
//		逻辑或 ｜ 两个判断有一个为true 结果为true 否则结果为flase 执行逻辑是 不管第一个判断为true还是flase都会执行第二个判断
//		短路或 ｜｜ 两个判断有一个为true 结果为true 否则结果为flase 执行逻辑是 第一个判断为true时 就不会执行第二个判断 
//					如果第一个结果为flase时才会去执行第二个判断
//		取反 ！ 如果判断是true 取反结果就为flase 如果判断是flase 取反结果就是true 
//		逻辑异或 ^ 两个判断一个为true另一个为flase时（不同） 结果为true  如果两个判断一个都为true或者都为flase（相同） 结果就为flase
//		三元运算符 （判断）？num1 ： num2； 判断为true 就会把判断值赋给num1 判断为flase 则把判断值赋给num2
		
		//*char String转换
//		String str = "23";
//		char Num = str.charAt(1);
//		System.out.println(Num);
		
		//*华氏度对应的摄氏度
//		double huashi = 234.5;
//		double sheshi = 5.0 / 9 * (huashi - 100);
//		System.out.println(huashi + "华氏度对应的是" + sheshi + "摄氏度");
		
		//*对学生成绩 进行判断 打印结果 成绩不能大于100 switch
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
		
		//**统计3个班成绩 每班5名同学 求出各个班平均分和所有班级的平均分 成绩键盘输入 统计及每班及格人数以及年级及格人数
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
		
		//**有100000 大于50000每次少5% 小于等于50000少1000 100000可以循环多少次 要求while break
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
		
		//***求出1-1/2+1/3-1/4...1/100的和
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
		
		//***求1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + 3 + ... + 100)的结果
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			for(int j = 1; j <= i; j++) {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
	}
}