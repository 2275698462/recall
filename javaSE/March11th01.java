public class March11th01 {
	public static void main(String[] args) {
		//��ʼ���ͱ�����������д�������ط����������ߵķֺŲ���ʡ��
		int i = 1;
		for( ; i <=10 ; ) {
			System.out.println("hello" + i);
			i++;
		}
		System.out.println(i);
          //����
		  //int j = 1;
		  //for(;;) { //��ʾһ������ѭ������ѭ��
		  //System.out.println("ok" + (j++));
		  // }
		  int count = 3;
		  //ѭ����ʼ�������ж�����ʼ����䣬��Ҫ������һ���������м��ö��Ÿ���,
		  //ѭ����������Ҳ�����ж�������������䣬�м��ö��Ÿ���
		  for (int i2 = 0,j2 = 0; i2 < count; i2++, j2 += 2) {
			  System.out.println("i2=" + i2 + " j2=" + j2);
		  }
	}
}