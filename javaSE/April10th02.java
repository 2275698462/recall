public class April10th02 {
	public static void main(String[] args) {
		Methods n = new Methods();
		n.m("sssssssss");
		System.out.println(n.max(1.1, 2.2, 3.3));
	}
}
class Methods {
	public void m(int n1) {
		System.out.println(n1 * n1);
	}
	public void m(int n1, int n2) {
		System.out.println(n1 * n2);
	}
	public void m(String s1) {
		System.out.println(s1);
	}
	public int max(int n1, int n2) {
          return n1 > n2 ? n1 : n2;
	}
		public double max(double n1, double n2) {
		if(n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
     	public double max(double n1, double n2, double n3) { 
			double max1 = n1 > n2 ? n1 : n2;
			return max1 > n3 ? max1 : n3;
	}
}