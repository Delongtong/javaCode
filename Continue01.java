/**
 * 
 * continue 指定数不输出
 */
public class Continue01{
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 4) {
			i++;
			if(i == 2) {
				//i等于2时不输出2 其他参数正常输出
				continue;
			}
			System.out.println(i);
		}
		
	}
}