package bridge;

//クラス名の通り、抽象的な、何かを表示するもの　クラスである。
//impplフィールドはこのクラスの「実装」を表すインスタンス。
//コンストラクタには実装を表すクラスのインスタンスを渡す⇨これが二つのクラス階層の橋
public class Display {

	private DisplayImpl impl;

	public Display(DisplayImpl impl) {

		this.impl = impl;

	}

	public void open() {

		impl.rawOpen();

	}

	public void print() {

		impl.rawPrint();

	}

	public void close() {

		impl.rawClose();

	}

	public final void display() {

		open();
		print();
		close();

	}


}
