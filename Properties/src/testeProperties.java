import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testeProperties {

	public static void main(String[] args) {
		
		System.out.print(loadProperties().getProperty("dburl"));
			
			
		
	}
	
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("teste.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
}
