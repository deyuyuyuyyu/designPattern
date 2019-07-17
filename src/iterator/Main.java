package iterator;

public class Main {

	public static void main(String args[]){

		BookShelf bookshelf = new BookShelf();
		bookshelf.appendBook(new Book("Adam"));
		bookshelf.appendBook(new Book("Brood"));
		bookshelf.appendBook(new Book("Chirly"));
		bookshelf.appendBook(new Book("Devid"));

		Iterator it = bookshelf.iterator();

		while(it.hasNext()){

			Book book = (Book)it.next();
			System.out.println(book.getName());

		}

		//改修後
		//本棚に収納できる本の数に制限がないので、新たに本を追加できる
		System.out.println("追加後");
		bookshelf.appendBook(new Book("Eve"));

		//追加後の本棚にIteratorをあてる
		it = bookshelf.iterator();

		while(it.hasNext()){

			Book book = (Book)it.next();
			System.out.println(book.getName());

		}

	}

}
