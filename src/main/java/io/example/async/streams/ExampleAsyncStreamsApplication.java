package io.example.async.streams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class ExampleAsyncStreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleAsyncStreamsApplication.class, args);
	}

}
