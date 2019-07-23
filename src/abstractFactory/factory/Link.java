package abstractFactory.factory;

//部品
public abstract class Link extends Item {

	protected String url;

	public Link(String caption, String url) {

		super(caption);
		this.url = url;

	}

}
