/**
 * 空心金字塔 现实步骤以及逻辑
 * @author tongdelong
 *
 */
public class ForStars{
	public static void main(String[] args) {
		/*
		 * 1.打印出5*5的*
		 * 2.打印半个金字塔
		 * 3.打印整个金字塔
		 * 4.打印空心金字塔
		*/
		int totalLevel = 10;
		for(int i = 1; i <= totalLevel; i++) {
			for(int k = 1; k <= totalLevel - i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}	
			System.out.println("");
		}
		
		
//		int cengshu = 10;
//		for (int i = 1; i <= cengshu; i++) {
//		    // 打印左侧空格
//		    for (int k = 1; k <= cengshu - i; k++) {
//		        System.out.print(" ");
//		    }
//		    // 打印左侧星号或空格
//		    for (int j = 1; j <= 2 * i - 1; j++) {
//		        if (j == 1 || j == 2 * i - 1 || i == cengshu || j == i || j == 2 * i - i) {
//		            System.out.print("*");
//		        } else {
//		            System.out.print(" ");
//		        }
//		    }
//		    System.out.println("");
//		}
//
//		for (int i = cengshu - 1; i >= 1; i--) {
//		    // 打印左侧空格
//		    for (int k = 1; k <= cengshu - i; k++) {
//		        System.out.print(" ");
//		    }
//		    // 打印左侧星号或空格
//		    for (int j = 1; j <= 2 * i - 1; j++) {
//		        if (j == 1 || j == 2 * i - 1 || i == cengshu || j == i || j == 2 * i - i) {
//		            System.out.print("*");
//		        } else {
//		            System.out.print(" ");
//		        }
//		    }
//		    System.out.println("");
//		}
		
		
	}
}