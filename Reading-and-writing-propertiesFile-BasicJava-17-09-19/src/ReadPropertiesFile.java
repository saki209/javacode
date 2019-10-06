import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) {
		
		try (FileInputStream FIS=new FileInputStream("D:\\F Drive\\db.properties")){
			Properties properties = new Properties();
			properties.load(FIS);
			System.out.println(properties.getProperty("db.username"));
			System.out.println(properties.getProperty("db.password"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
