public class Break02{
	public static void main(String[] args) {
		
//		i是3时 退出循环
		for(int i = 0; i <= 10; i++) {
			if(i == 3) {
				break;
			}
		}
		System.out.println("退出循环");
		
	}
}