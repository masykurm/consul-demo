package id.co.telkomsel.sa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"id.co","id.co.telkomsel","id.co.telkomsel.sa"})
public class ConsulDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsulDemoApplication.class, args);
	}

}
