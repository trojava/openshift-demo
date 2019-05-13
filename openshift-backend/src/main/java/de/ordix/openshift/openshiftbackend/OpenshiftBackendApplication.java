package de.ordix.openshift.openshiftbackend;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftBackendApplication.class, args);
	}
	
	@GetMapping("")
    public String helloWorld() throws UnknownHostException {

	    return "Hello from " + InetAddress.getLocalHost().getHostName();
    }

}
