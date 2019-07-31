package visitor;

import java.util.Iterator;

//acceptメソッドがvisitメソッドをよび、visitメソッドがacceptメソッドを呼ぶという
//再帰的にお互いを呼び合っている
public class ListVisitor extends Visitor {

	private String currentdir = "";
	public void visit(File file) {

		System.out.println(currentdir + "/" + file);

	}

	@Override
	public void visit(Directory directory) {

		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		Iterator it = directory.iterator();

		while(it.hasNext()) {

			Entry entry = (Entry)it.next();
			entry.accept(this);

		}

		currentdir = savedir;

	}

}
