public class November24th02 {
	public static void main(String[] args) {

	//char�ı�����һ����������Ĭ�����ʱ����Unicode�루�������֣���Ӧ���ַ�������ַ�鿴��
	//Ҫ�����Ӧ�����֣������ã�int���ַ�
		char c1 = 97;
		System.out.println(c1); // a

		char c2 = 'a';
		System.out.println((int)c2);   //���'a'��Ӧ������

		char c3 = '��';
		System.out.println((int)c3);   //���'��'��Ӧ������

		char c4 = 26519; 
		System.out.println(c4);  //��

		char c5 = 'b' + 1;   //98+1=99
		System.out.println((int)c5); //99
		System.out.println(c5);    //99��Ӧ���ַ��������ASCII��ASCII��Unicode�У�Ҳ�ܲ�ѯ��

		
	}
}