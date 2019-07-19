package builder;

public class Director {

	private Builder builder;

	//引数がBuilder型になっているが、実際にくる型はBuilder型ではない
	//Builderのサブクラスが引数として渡されてくる
	//与えられたサブクラスの種類によって、Directorが作る文書の形式が変わる
	public Director(Builder builder) {

		this.builder = builder;

	}

	public void construct() {

		builder.makeTitle("Greeting");
		builder.makeString("朝から昼にかけて");
		builder.makeItems(new String[]{

				"おはようございます",
				"こんにちは"

		});
		builder.makeString("夜に");
		builder.makeItems(new String[] {

				"こんばんは",
				"おやすみなさい",
				"さようなら"

		});

		builder.close();


	}

}
