package de.ciis0.reproducer.springboot34309;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoot34309Application {

	private static final Logger log = LoggerFactory.getLogger(SpringBoot34309Application.class);

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringBoot34309Application.class)
				.properties("repro.fieldWithSetterOnly=set", "repro.fieldWithSetterAndGetter=set")
				.run();
	}

	@ConfigurationProperties("repro")
	@Bean
	Reproducer reproducer(){
		return new Reproducer();
	}

	@Bean
	ApplicationRunner runner(Reproducer repro) {
		return args -> log.info("All fields set: {}", repro);
	}

}
