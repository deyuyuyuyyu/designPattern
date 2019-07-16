//flameworkクラスと分離するのを明示するため、別のパッケージに作成している
package idCard;

import flamework.Product;

//製品クラスのサブクラス
public class IDCard extends Product{
	
	private String owner;
	private int   serial;
	
	IDCard(String owner, int serial){
		
		System.out.println(owner + ":" + serial + "のカードを作ります");
		this.owner = owner;
		this.serial = serial;
		
	}
	
	public void use() {
		
		System.out.println(owner + "のカードを使います");
		
	}
	
	public String getOwner() {
		
		return this.owner;
		
	}
	
	public int getSerial() {
		
		return this.serial;
		
	}

}
