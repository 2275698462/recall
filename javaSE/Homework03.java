public class Homework03 {
	public static void main(String[] args) {
		A03 a = new A03();
		int[] arr = {1, 2, 3};
		int[] newarr = a.copyArr(arr);
		for(int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}

	}
}
class A03{
	public int[] copyArr(int[] oldArr){
		int[] newArr = new int[oldArr.length];
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}