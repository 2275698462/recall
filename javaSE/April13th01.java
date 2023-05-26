public class April13th01 {
	public static void main(String[] args) {
        OOO o = new OOO();
		System.out.println(o.sum(1, 2, 3));
	}
}
class OOO {
	public int sum(int... nums) {
		//System.out.println("接收参数个数="nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}