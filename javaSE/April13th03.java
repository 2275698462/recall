public class April13th03 {
	public static void main(String[] args) {
		HspMethod h = new HspMethod();
		System.out.println(h.showScore("����", 100, 11,11,11));
	}
}
class HspMethod {
	public String showScore(String name, double... score) {
		double sum = 0;
		if(score.length == 2 || score.length == 3 || score.length == 5) {
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return name + "�ɼ�=" + sum;
		} else {
			return "����ſ�����";
		}
	}
}