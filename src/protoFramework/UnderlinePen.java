package protoFramework;

public class UnderlinePen extends ConcreteProduct{
	
	private char underline;

	public UnderlinePen(char underline) {
		
		this.underline = underline;
		
	}

	@Override
	public void use(String s) {

		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		
		for(int i=0; i < length+4; i++) {
			
			System.out.print(underline);
			
		}
		
		System.out.println("");
		
	}


}
