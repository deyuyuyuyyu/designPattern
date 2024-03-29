package visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

	private String name; //ディレクトリの名前
	private ArrayList dir = new ArrayList(); //ディレクトリエントリの名前

	public Directory(String name) {
		this.name = name;
	}

	public Entry add(Entry entry) {

		dir.add(entry);
		return this;

	}

	public Iterator iterator() {

		return dir.iterator();

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

		int size = 0;
		Iterator it = dir.iterator();
		while(it.hasNext()) {

			Entry entry = (Entry)it.next();
			size += entry.getSize();

		}

		return size;
	}

}
