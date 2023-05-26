public class Homeword02 {
	public static void main(String[] args) {
     book b = new book(140);
	 b.updatePrice();
	 b.info();

	}
}
class book {
	int price;
	public book(int price) {
		this.price = price;
	}
	public void updatePrice() {
		if(price > 150){
			price = 150;
		} else if (price > 120) {
			price = 100;
		}
	}
	public void info() {
		System.out.println(price);
	}
}
