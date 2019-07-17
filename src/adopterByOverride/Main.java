package adopterByOverride;

public class Main {

	public static void main(String args[]) {


		/*
		 * ※ここで注意
		 * PrintBannerのインスタンスをPrintインターフェース型の変数に代入している。
		 * このMainクラスはあくまでPrintインターフェースを使ってPGしている。
		 * つまりBannerクラスに実装されたメソッドの内容を全く知らないということ。
		 * →だから、Mainは全く変更せずに、PrintBannerの中身さえ変更すれば、処理を変えられるということ
		 *
		 */
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();

	}

}
