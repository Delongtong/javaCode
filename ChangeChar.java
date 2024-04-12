//转义字符
public class ChangeChar{
	public static void main(String[] args) {
		System.out.println("1东京大阪横滨名古屋");
		System.out.println("2东京\t大阪\t横滨\t名古屋");
		System.out.println("3delotng\"东京大阪横滨名古屋\"");
		System.out.println("4delotng\'东京大阪横滨名古屋\'");
		System.out.println("5东京\\大阪\\横滨\\名古屋");
		System.out.println("6东京大阪横滨\r名古屋");
		System.out.println("7东京大阪横滨\r\n名古屋");
		System.out.println("8书籍信息\n书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");

	}
}