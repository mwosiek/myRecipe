package io.github.mwosiek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Validator;

@SpringBootApplication
public class MyRecipeApplication{
	public static void main(String[] args) {
		SpringApplication.run(MyRecipeApplication.class, args);
	}

	@Bean
	Validator validator() {
		return new LocalValidatorFactoryBean();
	}

}

	/*Dzięki wykorzystaniu adnotacji @Override kompilator otrzymuje
	od nas informację, że dana metoda będzie przysłaniać inną metodę.
	 W przypadku, gdy żadna metoda do przysłonięcia nie zostanie
	 odnaleziona (np. w interfejsie, w klasie rodzica) to kompilator
	 zwróci nam błąd.*/
	/*RepositoryRestConfigurer - z niej zaimplementowałam metode nizej,
	 * pod Override*/



