package ru.itmo.java2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itmo.java2025.less1.dto.ExampleDto;

@SpringBootApplication
public class ApplicationRunner {

	public static void main(String[] args) {
		ExampleDto exampleDto = new ExampleDto();
		exampleDto.setId(1);
		System.out.println(exampleDto.getId());

		SpringApplication.run(ApplicationRunner.class, args);
	}

}
