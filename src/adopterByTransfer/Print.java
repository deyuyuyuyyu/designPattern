/*
 * 委譲を使ってAdapterの役割を実現するために、
 * このPrintはインターフェースではなく、抽象クラスとなる
 *
 */

package adopterByTransfer;

public abstract class Print {

	public abstract void printWeak();
	public abstract void printStrong();

}
