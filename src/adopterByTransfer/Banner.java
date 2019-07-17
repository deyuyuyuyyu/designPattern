/*
 * Adopter1を当てる前に、既に存在しているもの
 * このパッケージはあくまでサンプルソースだが、実際の場合は別になにかしらの
 * 元クラスが存在しているものとする
 *
 */
package adopterByTransfer;

public class Banner {

	private String string;

	public Banner(String string){

		this.string = string;

	}


	public void showWithParen(){

		System.out.println("(" + this.string + ")");

	}


	public void showWithAster(){

		System.out.println("*" + this.string + "*");

	}

}
