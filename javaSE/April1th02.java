public class April1th02 {
	public static void main(String[] args) {
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("��=" + res[0]);
		System.out.println("��=" + res[1]);
	}
}
class AA {
	//1��һ�����������һ������ֵ�� [��η��ض���������������]
	public int[] getSumAndSub(int n1, int n2) {
		int[] resArr = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2���������Ҫ���з����������ͣ��򷽷���������ִ��������Ϊreturnֵ��
    //����Ҫ�󷵻�ֵ���ͱ����return��ֵ����һ�»����
	public double f1() {
		return 1;
	}
	//3�����������void���򷽷����п���û��return������ֻдreturn
	public void f2() {
		System.out.println("hello1");
	}

}