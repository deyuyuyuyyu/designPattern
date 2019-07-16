package singleton;

//スレッドセーフにするためにsynchronizedを実装したメソッド
public class SynchronizedSingleton {

	private static SynchronizedSingleton singleton = null;

	private SynchronizedSingleton() {
		
		System.out.println("インスタンスを生成しました");
		slowdown();
		
	}
	
	public static synchronized SynchronizedSingleton getInstance() {
		
		if(singleton == null) {
			
			singleton = new SynchronizedSingleton();
			
		}
		
		return singleton;
		
	}
	
	private void slowdown() {
		
		try {
			
			Thread.sleep(1000);
			
		}catch(InterruptedException e) {
		}
		
	}
	
}
