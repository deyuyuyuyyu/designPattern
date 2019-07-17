package adopter;

public class Properties {

	private String key;
	private String value;

	public Properties(){
	}

	public void setKey(String key, String value){

		this.key   = key;
		this.value = value;

	}

	public String getValue(String key){

		if(this.key.equals(key)){

			return value;

		}else{

			return "";

		}

	}




}
