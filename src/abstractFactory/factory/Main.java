package abstractFactory.factory;

public class Main {

	public static void main(String[] args) {

		if(args.length != 1) {

			System.out.println("引数を一つだけ入れて");
			System.exit(0);

		}

		Factory factory = Factory.getFactory(args[0]);

		Link asahi   = factory.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

		Tray traynews = factory.createTray("新聞");
		traynews.add(asahi);
		traynews.add(yomiuri);

		Page page = factory.CreatePage("LinkPage", "My");
		page.add(traynews);
		page.output();


	}

}
