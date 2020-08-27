package id.co.telkomsel.sa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Value("${my_name}")
	String myName;
	public String getMyName() {
		return myName;
	}
}
