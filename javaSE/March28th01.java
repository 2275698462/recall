public class March28th01 {
	public static void main(String[] args) {
		  int[] arr = new int[10];
		  //(int)(Math.random() * 100) + 1���������1 - 100
            for(int i = 0; i < arr.length; i++) {
				arr[i] = (int)(Math.random() * 100) + 1;
			}
			double sum = 0;
			for(int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
			System.out.println("ƽ���� = " + sum / arr.length);
			int max = arr[0];
			int maxIndex = 0;
			for(int i = 1; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
					maxIndex = i;
				}
			}
			System.out.println("max=" + max + " maxIndex=" + maxIndex);
			//�����������Ƿ���8
			int findNum = 8;
			int index = -1; //����ҵ����Ͱ��±��¼��index
			for(int i = 0; i < arr.length; i++) {
				if(findNum == arr[i]) {
					index = i;
					System.out.println("��8���±���" + i);
				}
			}
			if(index == -1) {
				System.out.println("������û8");
			}
                   
	}
}