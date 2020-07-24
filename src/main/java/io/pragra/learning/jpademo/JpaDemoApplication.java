package io.pragra.learning.jpademo;

import io.pragra.learning.jpademo.entity.Person;
import io.pragra.learning.jpademo.repository.PersonEntityRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaDemoApplication {
	private PersonEntityRepo repo;

	public JpaDemoApplication(PersonEntityRepo repo) {
		this.repo = repo;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			repo.savePerson(new Person("John", "Doe"));
			repo.savePerson(new Person("Jean", "Doe"));
			repo.savePerson(new Person("Happy", "Singh"));
			repo.savePerson(new Person("Sad", "Singh"));
			repo.savePerson(new Person("Dilbag", "SINGH"));
		};
	}
}
