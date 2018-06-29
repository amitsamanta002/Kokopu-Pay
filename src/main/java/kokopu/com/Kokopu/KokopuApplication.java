package kokopu.com.Kokopu;


import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KokopuApplication {

	private static final Logger log = LoggerFactory.getLogger(KokopuApplication.class);
	
	
	public static void main(String[] args) {
		log.info("application start-ed by amit");
		/*RestTemplate restTemplate = new RestTemplate();
		String response =restTemplate.getForObject("https://restcountries.eu/rest/v2/all", String.class);
		System.out.println(response);*/
		SpringApplication.run(KokopuApplication.class, args);
	}	
}
