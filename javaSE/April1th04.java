public class April1th04 {
	public static void main(String[] args) {
		AA a = new AA();
		if(a.f1(1)) {
			System.out.println("������");
		} else {
			System.out.println("��ż��");
		}
		//ʹ��print����
		a.print(4, 4, '#');
	}
}
class AA {
	public boolean f1(int num) {
		/*
		if(n1 % 2 == 0) {
			return false;
		} else {
			return true;
		}
		return num % 2 != 0 ? turn; fales;
		*/
         return num % 2 != 0;
	}
	//2�������С��С��ַ���ӡ��Ӧ�������������ַ������磺
    //�У�4���У�4���ַ�#�����ӡ��Ӧ��Ч��
	/*˼·
	       1�������ķ������� void
		   2������������print
		   3���������β�(int row ,int col, char c)
		   4�������壬ѭ��
	*/
	public void print(int row ,int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
			System.out.print(c);
		}
		System.out.println();
	}
}
}