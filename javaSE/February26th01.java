public class February26th01 {
	public static void main(String[] args) {
		//&&��·��ʹ��
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}
		//&�߼���ʹ��
		if(age > 20 & age < 90) {
			System.out.println("ok200");
		}
		//����
		int a = 4;
		int b = 9;
		if(a <1 && ++b <50) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);//a=4 b=9
		/*
		int a = 4;
		int b = 9;
		if(a <1 & ++b <50) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b); //a= 4 b=10
		*/
	}
}