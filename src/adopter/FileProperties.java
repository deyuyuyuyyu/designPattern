package adopter;

import java.io.IOException;

public class FileProperties extends Properties implements FileIO{

	public FileProperties(){
	}

	public void readFromFile(String fileName) throws IOException {


	}

	public void writeToFile(String filename) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void setValue(String key, String value) {

		super.setKey(key, value);

	}

	public String getValue(String key) {

		return super.getValue(key);

	}

}
