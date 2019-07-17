package iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {

//  改修前。配列で定義しているため最初に指定した数の本しか収納できない
//	private Book[] books;
//	private int    last = 0;
//
//	public BookShelf(int maxsize) {
//
//		this.books = new Book[maxsize];
//
//	}
//
//	public Book getBookAt(int index) {
//
//		return books[index];
//
//	}
//
//	public void appendBook(Book book) {
//
//		this.books[last] = book;
//		last++;
//
//	}
//
//	public int getLength(){
//
//		return last;
//
//	}
//
//	public Iterator iterator(){
//
//		return new BookShelfIterator(this);
//
//	}


	//改修後。本が増えるたびに本棚の大きさが自動で調節される
	ArrayList books = new ArrayList();


	public BookShelf() {
	}

	public Book getBookAt(int index) {

		return (Book)books.get(index);

	}

	public void appendBook(Book book) {

		this.books.add(book);

	}

	public int getLength(){

		return this.books.size();

	}

	public Iterator iterator(){

		return new BookShelfIterator(this);

	}

}
