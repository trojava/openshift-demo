package de.ordix.openshift.openshiftfrontend;

import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class OpenshiftFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftFrontendApplication.class, args);
	}

	@GetMapping
	public String helloWorld() throws UnknownHostException {

		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = "http://demo-backend:8080";
		ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl, String.class);
		return "Message from backend is: " + response.getBody();
	}
}
