public class December16th {
	public static void main(String[] args) {

		//4、byte，short，char他们三者可以计算，在计算时首先转换为int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1; 错误，b2 + s1=>int
		int s2 = b2 + s1;
		//byte b4 = b2 + b3;//错误，b2 + b3=>int
	}
}