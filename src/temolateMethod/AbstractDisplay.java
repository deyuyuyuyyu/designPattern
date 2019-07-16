package temolateMethod;

public abstract class AbstractDisplay {

	public abstract void open();
	public abstract void print();
	public abstract void close();


	//抽象メソッドを用いることで、流れだけを定義できた。
	public final void display(){

		open();

		for(int i=0; i < 5; i++) {

			print();

		}

		close();

	}

}
