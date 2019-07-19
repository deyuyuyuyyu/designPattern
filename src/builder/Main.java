package builder;

public class Main {

	public static void main(String[] args) {

		TextBuilder txbuilder = new TextBuilder();
		Director director = new Director(txbuilder);
		director.construct();
		String result = txbuilder.getResult();
		System.out.println(result);

	}

}
