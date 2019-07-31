package visitor;

//acceptメソッドをどう実装するかがポイント
//v.visit(this)により、EntryのFile側のvisitメソッドを呼び出す。
public class File extends Entry {

	private String name;
	private int size;

	public File(String name, int size) {

		this.name = name;
		this.size = size;

	}

	@Override
	public void accept(Visitor v) {

		v.visit(this);

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

}
