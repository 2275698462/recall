public class April16th03 {
	public static void main(String[] args) {
		A01 a1 = new A01();
		double[] arr = {1, 2, 3, 4};
		System.out.println(a1.max(arr));
	}
}
class A01 {
	public double max(double[] arr){
		double max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}