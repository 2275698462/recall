public class February24th01 {
	public static void main(String[] args) {
		//1�����󣺼��绹��59��ż٣��ʣ���xx��������xx��
		//2��˼·����
		//��1��ʹ��int ���� days ��������
		//��2��һ��������7�� ������ days / 7   ����xx�� days % 7
		//��3�����
		//3���ߴ���
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "�� ��" + weeks + "��������" + leftdays + "��");
	}
}
