public class March1th {
	public static void main(String[] args) {
		 int a = 10;
		 int b = 99;
		 int result = a > b ? a++ : b--;
		 //1¡¢a>bÎªfalse
		 //2¡¢·µ»Øb--
		 System.out.println("result=" + result);//99
	}
}