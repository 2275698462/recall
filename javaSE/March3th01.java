public class March3th01 {
	public static void main(String[] args) {
		System.out.println(2 & 3);
		/*
		  推导过程:
		   1、先得到2的补码->2的原码00000000 00000000 00000000 00000010（int有四个bit）
		                   2的补码 00000000 00000000 00000000 00000010
           2、3的补码->3的原码00000000 00000000 00000000 00000000 00000011
		                   3的补码 00000000 00000000 00000000 00000011
           3、按位&
		   00000000 00000000 00000000 00000010
		   00000000 00000000 00000000 00000011
		   00000000 00000000 00000000 00000010  (运算后的补码)
		   运算后的原码也是补码（正数）
		   结果转为十进制
		*/
		System.out.println(~ -2);//1
		/*
		推导
		      1、先得到 -2的原码 10000000 00000000 00000000 00000010
			  2、            -2的反码 11111111 11111111 11111111 11111101
			  3、            -2的补码 11111111 11111111 11111111 11111110（反码加一）
			  4、             ~-2操作  00000000 00000000 00000000 00000001 (运算后的补码)
			  5、               看运算后的补码对应的原码
		*/
		System.out.println(~2);
		/*
		    1、得到2的补码 00000000 00000000 00000000 00000010
			2、~2操作          11111111 11111111 11111111 11111101  运算后的补码
			3、运算后的反码(补码 - 1) 11111111 11111111 11111111 11111100
			4、运算后的原码                10000000 00000000 00000000 00000011——> -3
		*/

	}
}