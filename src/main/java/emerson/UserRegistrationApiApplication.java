package emerson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class UserRegistrationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApiApplication.class, args);
	}

}
