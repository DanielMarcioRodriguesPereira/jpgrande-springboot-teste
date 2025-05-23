package com.dmrp.jpgrande.springboot.test.saudacoestemplate;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Bom dia, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(defaultValue = "c") String name) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Foca aqui! Diga seu nome, vai aparecer no JSON:");
		name = sc.nextLine();
		System.out.println("Vá checar.");

		sc.close();

		return new Greeting(counter.incrementAndGet(), template.formatted(name));
	}
}
