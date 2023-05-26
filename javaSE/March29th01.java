public class March29th01 {
	public static void main(String[] args) {
		//cat1就是一个对象
		  Cat cat1 = new Cat();
          cat1.name = "小白";
		  cat1.age = 3;
		  cat1.color = "白色";
		  //cat2也是一个对象
		  Cat cat2 = new Cat();
		  cat2.name = "小花";
		  cat2.age = 100;
		  cat2.color = "花色";
		  System.out.println("第1只猫信息" + cat1.name + " " + cat1.age + " " 
			  + " " + cat1.color);
		  System.out.println("第2只猫信息" + cat2.name + " " + cat2.age + " " 
		       + " " + cat2.color);
	}
}
		//定义一个猫类Cat ->自定义的数据类型
             class Cat {
				 String name;
				 int age;
				 String color;
				 double weigh;
			 }