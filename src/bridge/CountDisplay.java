package bridge;

//機能の追加
//Displayクラスには「表示する」しか機能がなかったが、このクラスで「指定回数だけ表示する」という機能を追加してみた。
public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {

		super(impl);

	}

	public void multiDisplay(int times) {

		open();
		for(int i=0; i<times; i++) {

			print();

		}
		close();

	}

}
