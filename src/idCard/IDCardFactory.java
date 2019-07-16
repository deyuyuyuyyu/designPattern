package idCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import flamework.Factory;
import flamework.Product;

public class IDCardFactory extends Factory {

	private HashMap database = new HashMap();
	private List owners = new ArrayList();
	private int serial = 100;
	
	@Override
	protected Product createProduct(String owner) {

		return new IDCard(owner, serial++);
		
	}

	@Override
	protected void registedProduct(Product product) {
		
		IDCard card  = (IDCard)product;
		database.put(new Integer(card.getSerial()), card.getOwner());

	}

}
