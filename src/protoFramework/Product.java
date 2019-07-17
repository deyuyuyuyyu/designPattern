package protoFramework;

//Cloneableインターフェースを実装しているクラスのインスタンスは
//cloneメソッドを使って自動的に複製を行うことができる。
public interface Product extends Cloneable{

	public abstract void use(String s);
	public abstract Product createClone();

}
