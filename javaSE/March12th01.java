public class March12th01 {
	public static void main(String[] args) {
		//��ӡ1-100֮��������9�ı�����������ͳ�Ƹ������ܺ�
		/*
		�������˼��
		1������Ϊ�򣺽����ӵ����󣬲��ɼ򵥵����������
		2���������ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ
		˼·������
		����Ϊ��
		1��������1-100��ֵ
		2��������Ĺ����У����й��ˣ�ֻ���9�ı���   i % 9 == 0
		3��ͳ�Ƹ���������һ������int count = 0;����������ʱ count++��
		4���ܺͣ�����һ������int sum = 0;����������ʱ����sum += i;
		�������
		1��Ϊ����Ӧ���õ����󣬰ѷ�Χ�Ŀ�ʼֵ�ͽ�����ֵ���ɱ���,int start = 100;
		2�������Ը���һ����9����Ҳ�������� int t = 9;
		*/
		     int count = 0;
			 int sum = 0;
			 int start = 1;
			 int end = 100;
			 int t = 9 ;
          for(int i = start; i <= end; i++) {
			  if( i % t == 0) {
			  System.out.println("i=" + i);
			  count++;
			  sum += i;
			  }
		  }
		  System.out.println(count);
          System.out.println(sum);
	}
}