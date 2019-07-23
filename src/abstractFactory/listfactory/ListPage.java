package abstractFactory.listfactory;

import abstractFactory.factory.Page;

public class ListPage extends Page {

	public ListPage(String title, String author) {

		super(title, author);

	}

	@Override
	public String makeHTML() {

		StringBuffer buffer = new StringBuffer();
		buffer.append("");
		return buffer.toString();
	}

}
