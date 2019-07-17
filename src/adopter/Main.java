package adopter;
import java.io.IOException;

public class Main {

	public static void main(String args[]){

		FileIO f = new FileProperties();

		try {

			f.readFromFile("file.txt");
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "24");
			f.writeToFile("newFile.txt");

		}catch(IOException e){

			e.printStackTrace();

		}
	}

}
