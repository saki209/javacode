import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreatePropertiesFile {
public static void main(String[] args) {
	try {
		//creating the properties file 
		FileOutputStream outputStream = new FileOutputStream("D:\\F Drive\\dbCreate.properties");
	
		Properties properties = new Properties();
		properties.setProperty("name","saki209");
		properties.setProperty("city", "HYD");
		properties.setProperty("uid", "21152");
		//storing the key and values into the properties file
		properties.store(outputStream, "");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
