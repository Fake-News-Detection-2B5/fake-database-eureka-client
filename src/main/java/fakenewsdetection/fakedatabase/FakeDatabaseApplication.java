package fakenewsdetection.fakedatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FakeDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakeDatabaseApplication.class, args);
	}

}
