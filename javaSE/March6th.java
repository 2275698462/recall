import java.util.Scanner;
public class March6th {
	public static void main(String[] args) {
	//���һ�����򣬿�������һ�����䣬����������18�꣬
	//�����"���������18��ҪΪ�Լ�����Ϊ����"
	/*
	˼·����
	1�������������䣬����һ��Scanner����
	2�������䱣�浽һ������int age
	3��ʹ��if�жϣ������Ӧ����
	*/
	Scanner myScanner = new Scanner(System.in);
	System.out.println("����������");
	int age = myScanner.nextInt();
	if(age > 18) {
         System.out.println("���������18��ҪΪ�Լ�����Ϊ����");
	                   } else {
						   System.out.println("������䲻����ηŹ�����");
					             }
	}
}
