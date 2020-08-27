package id.co.telkomsel.sa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	MyService service;
	
	@GetMapping("/names")
	public String getNames() {
		return service.name();
	}
}
