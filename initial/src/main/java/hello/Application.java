package hello;

import java.net.InetAddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
    @RequestMapping("/")
    public String home() throws Exception {
    	System.out.println("Servindo um hello bem de boas...");
        return "Hello iBeer! - proudly served by " + InetAddress.getLocalHost().getHostName();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
