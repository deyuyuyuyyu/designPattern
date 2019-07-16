package temolateMethod;

public abstract class AbstractDisplay {

	public abstract void open();
	public abstract void print();
	public abstract void close();


	//抽象メソッドを用いることで、流れだけを定義できた。
	//final修飾子をつけることで、オーバーライドを禁止している
	//これは、サブクラスにてメソッドの処理の流れが書き換えられることを禁止する役割を果たす。
	public final void display(){

		open();

		for(int i=0; i < 5; i++) {

			print();

		}

		close();

	}

}
