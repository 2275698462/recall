public class March24th04 {
	public static void main(String[] args) {
		//ð���������ʵ��
		int[] arr = {24, 69, 80, 57 ,13,};
		int temp = 0;//���ڸ��������ı���
		//�������-> 4 =  arr.length - 1
		for( int i = 0; i < arr.length - 1; i++) {        //���ѭ���ĴΣ����������������ڶ������
		for( int j = 0; j < arr.length - 1 - i; j++) {     //�Ƚ�4,3,2,1��
		//���ǰ����� > ����������ͽ���
		if(arr[j] > arr[j + 1]) {
           temp = arr[j];
		   arr[j] = arr[j + 1];
		   arr[j + 1] = temp;
		   } 
		}
		System.out.println("\n" + "��" + (i +1) + "��");
		       for( int j = 0; j < arr.length; j++) {
			   System.out.print(arr[j] + "\t");
		   }
  }

	}
}