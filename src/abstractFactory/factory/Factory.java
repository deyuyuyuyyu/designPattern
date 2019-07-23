package abstractFactory.factory;

//工場
public abstract class Factory {

	public static Factory getFactory(String className) {

		Factory factory = null;

		try {

			factory = (Factory)Class.forName(className).newInstance();

		}catch(ClassNotFoundException e) {

			System.out.println("右のクラスが見つかりません" + className);

		}catch(Exception e) {

			e.printStackTrace();

		}

		return factory;

	}

	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page CreatePage(String title, String author);

}
