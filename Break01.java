/**
 * break
 * @author tongdelong
 *
 */
public class Break01{
	public static void main(String[] args) {
		
		
//		//1-100随机数 随机数是97时 终止循环 for方法
//		int ftrquency = 0;
//		
//		for(;;) {
//			int randomNum = (int)(Math.random()*100 + 1);
//			ftrquency++;
//			
//			if(randomNum == 97) {
//				System.out.println(randomNum);
//				System.out.println("执行了" + ftrquency + "次找到了97");
//				break;
//			}
//			
//		}
		
//		//1-100随机数 随机数是97时 终止循环 while方法
//		int ftrquency = 0;
//		while(true) {
//			int randomNum = (int)(Math.random()*100 + 1);
//			ftrquency++;
//			if(randomNum == 97) {
//				System.out.println(randomNum);
//				System.out.println("执行了" + ftrquency + "次找到了97");
//				break;
//			}
//		}
		
//     	//1-100随机数 随机数是97时 终止循环 dowhile方法
		int ftrquency = 0;
		do {
			int randomNum = (int)(Math.random()*100 + 1);
			ftrquency++;
			if(randomNum == 97) {
				System.out.println(randomNum);
				System.out.println("执行了" + ftrquency + "次找到了97");
				break;
			}
		}while(true);
			
	}
}