package factoryMethod;

import flamework.Factory;
import flamework.Product;
import idCard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		
		Factory factory = new IDCardFactory();
		Product card1   = factory.create("佐藤太郎");
		Product card2   = factory.create("鈴木次郎");
		Product card3   = factory.create("田中三郎");
		
		card1.use();
		card2.use();
		card3.use();

	}

}
