public class March27th02 {
	public static void main(String[] args) {
		/*
		���� + ��λ
		1����ȷ�������Ӧ�ò��뵽�ĸ�����
		2��Ȼ������
		*/
		int[] arr = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1; //index����Ҫ�����λ��
		/*
		1������arr���飬�������insertNum<=arr[i],˵�� i ����Ҫ�����λ��
        2��ʹ��index���� �� index = i
		3������������û�з���insertNum<=arr[i],˵��index = arr.length
		������ӵ�arr�����
		*/
		for(int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			index = arr.length;
		}
		int[] arrNew = new int[arr.length + 1];
		//��arr��Ԫ�ؿ�����arrNew,��������indexλ��
		// i����arrNew���±꣬j��������arr�����±�
           for(int i = 0, j = 0; i < arrNew.length; i++) {
			   if( i != index) {
				   arrNew[i] = arr[j];
				   j++;
			   } else {
				   arrNew[i] = insertNum;
			   }
		   }
		   arr = arrNew;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}