package PoppleUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFilesPopple {
	
	public Properties LoadPropertiess() throws IOException {

		String propfilepath = "Popple.properties";
		Properties p = new Properties();
		p.load(new FileInputStream(propfilepath));

		return p;
	}

	
	
}
