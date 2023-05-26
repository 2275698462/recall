public class February24th01 {
	public static void main(String[] args) {
		//1、需求：假如还有59天放假，问：合xx个星期零xx天
		//2、思路分析
		//（1）使用int 变量 days 保存天数
		//（2）一个星期是7天 星期数 days / 7   ；零xx天 days % 7
		//（3）输出
		//3、走代码
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天 合" + weeks + "个星期零" + leftdays + "天");
	}
}
