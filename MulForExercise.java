/**
 * 多重循环（重）
 * @author tongdelong
 *
 */
import java.util.Scanner;
public class MulForExercise{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		//统计X个班级成绩情况 每个班有X名同学 求出各个班的平均分和所有班级的平均分 并给出每个班的几个人数
		byte classCount = 3;//年级的班级数量
		byte classUser = 5;//每个班级人数
		double allClassScore = 0;//所有班级总成绩初始值
		double passScore = 6;//及格分
		byte allClassPassNum = 0;//年级及格人数
		
		for(byte classCountNum = 1; classCountNum <= classCount; classCountNum++) {//循环每个班级
			double classScore = 0;//单个班级成绩 内循环后清零 重新计算下一个班级成绩
			byte classPassNum = 0;//每个班级及格人数 内循环后清零 重新计算下一个班级的及格人数
			for(byte classUserNum = 1; classUserNum <= classUser; classUserNum++) {//循环每班每个学生
				System.out.println("输入" + classCountNum + "班第" + classUserNum + "个学生的成绩");//输入单个班级每个学生的成绩
				double score = myScanner.nextDouble();//接收成绩
				if(score >= passScore) {//判断学生成绩大于等于及格分
					classPassNum++;//判断为true 人数增加一个
				}
				classScore += score;	//单个班级总成绩迭代
			}
			allClassPassNum += classPassNum;//单个班级及格人数迭代
			allClassScore += classScore;//累计计算年级总成绩
			System.out.println(classCountNum + "班有" + classPassNum +"人及格");//输出单个班级及格人数
			System.out.println(classCountNum + "班总成绩是" + classScore);//输出单个班级总成绩
			System.out.println(classCountNum + "班平均分是" + (classScore / classUser));//输出单个班级平均分
		}
		
		System.out.println("=============================================================================");
		System.out.println("年级总成绩是" + allClassScore);//输出年级总成绩
		System.out.println("年级有" + allClassPassNum +"人及格");//输出年级及格人数
		System.out.println("年级班级平均分是" + (allClassScore / classCount));//输出年级班级平均分
		System.out.println("年级所有学生平均分是" + (allClassScore / (classCount * classUser)));//输出年级所有学生的平均分
		System.out.println("循环结束 程序继续");

//		//输出99乘法表
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j + " * " + i + " = " + (i*j) + "\t");
//			}
//			System.out.print("\n");
//		}
	}
}