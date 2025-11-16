package Object_Repo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class LoginPage {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("");
		Properties p=new Properties();
		p.load(fis);
		String username=p.getProperty("name");
		

	}

}
