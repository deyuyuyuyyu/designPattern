package abstractFactory.listfactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

//具体的な工場
//具体的な部品を使って、具体的な製品を組み立てる
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
