package decorator;

public abstract class Border extends Display {

	protected Display display; //この飾り枠が包んでいる「中身」を示す。

	protected Border(Display display) { //インスタンス生成時に中身を指定

		this.display = display;

	}

}
