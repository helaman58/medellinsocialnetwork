package co.afdm.msn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("co.afdm.msn")
public class MedellinSocialNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedellinSocialNetworkApplication.class, args);
	}
}
