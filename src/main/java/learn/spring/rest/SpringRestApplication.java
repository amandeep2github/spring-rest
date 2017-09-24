package learn.spring.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
public class SpringRestApplication /*implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

	/*@Override
	public void run(String... arg0) throws Exception {
		Thread.currentThread().join();
		
	}*/
}
