package visitor;

//訪問者を表す抽象クラス
//この訪問者は訪問先のデータ構造に依存している
public abstract class Visitor {

	public abstract void visit(File file);
	public abstract void visit(Directory directory);

}
