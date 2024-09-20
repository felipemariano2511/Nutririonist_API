package br.com.felipemariano.nutrition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.felipemariano.nutrition.repository")
public class NutritionApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutritionApplication.class, args);
	}

}
