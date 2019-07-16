package singleton;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	private static int ticket = 100;
	
	private Singleton() {
		
		System.out.println("インスタンスを作成しました");
		
	}
	
	public static Singleton getInstance() {
		
		return singleton;
		
	}
	
	public static int getTicketNo() {
		
		return ticket++;
		
	}

}
