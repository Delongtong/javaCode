public class BreakDetail{
	public static void main(String[] args) {
		
		a:
		for(int i = 0; i < 4; i++) {
			b:
			for(int j = 0; j < 9; j++) {
				if(j == 3) {
					break a;//退出外层循环
				}
				System.out.println("j = " + j);
			}
		}
		
	}
}