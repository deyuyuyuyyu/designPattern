/*
iteratorの具象メソッド
iteratorて定義されている抽象メソッドに対して実際の処理を定義する
iteratorインターフェースがあることによって、それを実装した具象iteratorごとに、
好きな処理を追加してメソッドを定義することができる
*/

package iterator;

public class BookShelfIterator implements Iterator{

	private BookShelf bookshelf;
	private int       index;

	public BookShelfIterator(BookShelf bookshelf){

		this.bookshelf = bookshelf;
		this.index     = 0;

	}

	@Override
	public boolean hasNext() {

		if(index < bookshelf.getLength()) {

			return true;

		}else {

			return false;

		}

	}

	@Override
	/*
	 * ここのnextメソッドは、具体的な名前を付けるのであれば、
	 * returnCurrentIndexArrayAndMovePointerToNextIndex
	 * となる。
	 *
	 *
	 */
	public Object next() {

		Book book = bookshelf.getBookAt(index);
		index++;

		return book;

	}

}
