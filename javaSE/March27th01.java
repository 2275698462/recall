public class March27th01 {
	public static void main(String[] args) {
		int[] arr = {10, 12, 45, 90};
		int[] arrNew = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		arrNew[arrNew.length - 1] = 23;
		arr = arrNew;
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
          for(int j = 0; j < arr.length - 1 - i; j++) {
			  if(arr[j] > arr[j + 1]) {
				  temp = arr[j];
				  arr[j] = arr[j + 1];
				  arr[j + 1] = temp;
			  }
		  }
		}
		  
		   for(int i = 0; i < arr.length; i++) {
			   System.out.print(arr[i] + " ");
		   }
	}
}