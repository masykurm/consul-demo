package id.co.telkomsel.sa;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Autowired
	MyConfig config;
	
	public MyService() {
	}
	
	@PostConstruct
	public void post() {
		System.out.println("My name: "+ config.getMyName());
	}
	
	public String name() {
		return config.getMyName();
	}
}
