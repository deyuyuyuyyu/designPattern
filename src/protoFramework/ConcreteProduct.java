package protoFramework;

public abstract class ConcreteProduct implements Product {

	@Override
	public abstract void use(String s);

	@Override
	//サブクラスで共有する
	public Product createClone() {
		
		Product p = null;
		
		try {
			
			p = (Product)clone();
			
		}catch(CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return p;
		
	}

}
