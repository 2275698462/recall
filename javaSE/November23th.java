public class November23th{
  public static void main(String[] args){
	  double num1 = 2.7;
	  double num2 = 8.1 / 3;//2.7

	  System.out. println(num1);//2.7
	  System.out.println(num2);//�ӽ�2.7��һ��С����������2.7

                           if( num1 == num2){        //����д���������
							   System.out.println("���");
						   }
//�õ�һ����Ҫ��ʹ�õ㣺����������С���Ľ����ж�ʱ��ҪС�ġ�
//Ҫ���������Ĳ�ֵ�ľ���ֵ��ĳ�����ȷ�Χ�ڽ����жϡ�
                         if (Math.abs(num1 - num2) < 0.00001) {       //��ȷд�����������
                              System.out.println("��ֵ�ǳ�С�����ҵľ��ȷ�Χ�ڣ���Ϊ���");
                         }
						 System.out.println(Math.abs(num1 - num2));

						 //ϸ�ڣ������ֱ�Ӳ�ѯ�õ���С������ֱ�Ӹ�ֵ������ֱ���ж����
     }
}