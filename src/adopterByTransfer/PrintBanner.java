/*
 * これがAdopterの役割を果たすクラス。
 * 用意されているBannerクラスはそのままに、Printクラスを実装し、前処理を行った後、
 * Bannerクラスに前処理後の処理を委譲している
 *
 */
package adopterByTransfer;

public class PrintBanner extends Print{


	private Banner banner;
	public PrintBanner(String string){

		this.banner = new Banner(string);

	}

	@Override
	public void printWeak() {

		banner.showWithParen();

	}

	@Override
	public void printStrong() {

		banner.showWithAster();

	}



}
