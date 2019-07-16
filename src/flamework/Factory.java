package flamework;

//TempleteMethodパターンが使われている。
//抽象メソッドcreateProductで製品を作り、作った製品を抽象メソッドregistedProductで登録する。
//製品を作ると登録の実装はサブクラスで行う。

//このクラスが知っているのは、Product役(Productクラス)とインスタンス生成のメソッド(createProduct)を呼び出せば、
//Productが生成されるということ。

//肝は、newによる実際のインスタンスの生成をcreateProductに委ねているという点。
//これにより、具体的なクラス名による束縛からスーパークラスを解放している。

public abstract class Factory {
	
	public final Product create(String owner) {
		
		//仮に、
		//		Product p = new IDCard();
		//としてしまうと、汎用性が皆無になってしまう。
		Product p = createProduct(owner);
		registedProduct(p);
		return p;
		
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void   registedProduct(Product product);

}
