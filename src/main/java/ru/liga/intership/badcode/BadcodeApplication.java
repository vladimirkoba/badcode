package ru.liga.intership.badcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.liga.intership.badcode.service.CalculatorService;

@SpringBootApplication
public class BadcodeApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BadcodeApplication.class, args);
		CalculatorService calculatorService = new CalculatorService();
		calculatorService.getAverageBMI();
//		ввв
		//2
	}
}
