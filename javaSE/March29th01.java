public class March29th01 {
	public static void main(String[] args) {
		//cat1����һ������
		  Cat cat1 = new Cat();
          cat1.name = "С��";
		  cat1.age = 3;
		  cat1.color = "��ɫ";
		  //cat2Ҳ��һ������
		  Cat cat2 = new Cat();
		  cat2.name = "С��";
		  cat2.age = 100;
		  cat2.color = "��ɫ";
		  System.out.println("��1ֻè��Ϣ" + cat1.name + " " + cat1.age + " " 
			  + " " + cat1.color);
		  System.out.println("��2ֻè��Ϣ" + cat2.name + " " + cat2.age + " " 
		       + " " + cat2.color);
	}
}
		//����һ��è��Cat ->�Զ������������
             class Cat {
				 String name;
				 int age;
				 String color;
				 double weigh;
			 }