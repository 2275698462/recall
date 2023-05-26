public class Homework01 {
	public static void main(String[] args) {
		String[] arr = {"122", "hello"};
		A02 a = new A02();
		System.out.println(a.find("122", arr));
	}
}
class A02 {

	public int find(String s1, String[] arr) {
			
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(s1)) {
				return i;
			} 
	}
		return -1;
}
}