package visitor;

//elementは訪問者を受け入れるインターフェース
public interface Element {

	public abstract void accept(Visitor v);

}
