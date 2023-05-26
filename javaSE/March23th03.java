public class March23th03 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr1[0] = 100;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
	}
}