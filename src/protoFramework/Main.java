package protoFramework;

public class Main {

	public static void main(String[] args) {
		
		//準備
		Manager manager   = new Manager();
		UnderlinePen upen = new UnderlinePen('-');
		MessageBox box1   = new MessageBox('*');
		MessageBox box2   = new MessageBox('/');
		
		manager.register("strong message", upen);
		manager.register("warnig box"    , box1);
		manager.register("slash box"     , box2);
		
		
		//生成
		Product p1 = manager.create("strong message");
		p1.use("Hello world");
		Product p2 = manager.create("warnig box");
		p2.use("Hello world");
		Product p3 = manager.create("slash box");
		p3.use("Hello world");

	}

}
