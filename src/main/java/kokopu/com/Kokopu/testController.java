package kokopu.com.Kokopu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@RequestMapping("/test")
	public String getmethod() {
		return "Hi";
	}

}
