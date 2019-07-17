package protoFramework;

import java.util.HashMap;

//このクラスの中に、他のクラスの名前を書いてはいけない。
//他のクラスの名前を書いてしまうと、そのクラスとの間に依存関係ができてしまい、
//モジュールの独立性が低くなってしまう。
public class Manager {

	private HashMap showcase = new HashMap();
	public void register(String name, Product proto) {

		showcase.put(name, proto);

	}

	public Product create(String productName) {

		Product p = (Product)showcase.get(productName);
		return p.createClone();

	}

}
