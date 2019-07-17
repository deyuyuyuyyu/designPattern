/*
 * これがAdopterの役割を果たすクラス。
 * 用意されているBannerクラスを拡張して、Printインターフェースを実装する
 *
 */
package adopterByOverride;

public class PrintBanner extends Banner implements Print{


	public PrintBanner(String string){

		super(string);

	}

	@Override
	public void printWeak() {

		showWithParen();

	}

	@Override
	public void printStrong() {

		showWithAster();

	}



}
