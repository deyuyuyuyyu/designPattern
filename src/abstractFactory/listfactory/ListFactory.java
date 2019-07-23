package abstractFactory.listfactory;

import abstractFactory.factory.*;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page CreatePage(String title, String author) {
		return new ListPage(title, author);
	}

}
