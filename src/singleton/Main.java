package singleton;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		SynchronizedSingleton singleton1 = SynchronizedSingleton.getInstance();
		SynchronizedSingleton singleton2 = SynchronizedSingleton.getInstance();
		
		if(singleton1 == singleton2) {
			
			System.out.println("二つは同じインスタンスです");
			
		}else {
			
			System.out.println("二つは異なるインスタンスです");
			
		}
		
		System.out.println("End");
				
	}

}
