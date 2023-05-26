public class March12th01 {
	public static void main(String[] args) {
		//打印1-100之间所有是9的倍数的整数，统计个数及总和
		/*
		两个编程思想
		1、化繁为简：将复杂的需求，拆解成简单的需求，逐步完成
		2、先死后活：先考虑固定的值，然后转成可以灵活变化的值
		思路分析：
		化繁为简：
		1、完成输出1-100的值
		2、在输出的过程中，进行过滤，只输出9的倍数   i % 9 == 0
		3、统计个数，定义一个变量int count = 0;当条件满足时 count++；
		4、总和，定义一个变量int sum = 0;当条件满足时积累sum += i;
		先死后活
		1、为了适应更好的需求，把范围的开始值和结束的值做成变量,int start = 100;
		2、还可以更近一部，9倍数也做出变量 int t = 9;
		*/
		     int count = 0;
			 int sum = 0;
			 int start = 1;
			 int end = 100;
			 int t = 9 ;
          for(int i = start; i <= end; i++) {
			  if( i % t == 0) {
			  System.out.println("i=" + i);
			  count++;
			  sum += i;
			  }
		  }
		  System.out.println(count);
          System.out.println(sum);
	}
}