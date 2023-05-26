public class March5th01 {
	public static void main(String[] args) {
		System.out.println(1 >> 2); //1=>00000001=>00000000 本质 1 / 2 / 2
		System.out.println(1 << 2); //1=>00000001=>00000100 本质1 * 2 * 2
		System.out.println(4 << 3);// 4 *2 * 2 *2
		System.out.println(15 >> 2); //15 / 2 / 2

	}
}