public class April15th01 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
	}
}
class Dog {
	//3、如果没有定义构造器，系统会自动给类生成一个默认无参构造器（也叫默认构造器），
	//	使用javap反编译查看

	/*
             默认构造器
			 Dog() {
              }
	*/
	public Dog(String dName) {
                 //4、一旦定义了自己的构造器，默认的构造器就覆盖了，
                 //就不能使用默认的无参构造器，除非显示的定义一下。
	}
	  Dog(){
	}
}