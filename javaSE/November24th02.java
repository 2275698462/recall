public class November24th02 {
	public static void main(String[] args) {

	//char的本质是一个整数，在默认输出时，是Unicode码（类似数字）对应的字符。（网址查看）
	//要输出对应的数字，可以用（int）字符
		char c1 = 97;
		System.out.println(c1); // a

		char c2 = 'a';
		System.out.println((int)c2);   //输出'a'对应的数字

		char c3 = '林';
		System.out.println((int)c3);   //输出'林'对应的数字

		char c4 = 26519; 
		System.out.println(c4);  //林

		char c5 = 'b' + 1;   //98+1=99
		System.out.println((int)c5); //99
		System.out.println(c5);    //99对应的字符，编码表ASCII。ASCII在Unicode中，也能查询到

		
	}
}