package com.example.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.hello.services.Calculadora;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class calculadora {

	@Test
	void testSoma() {
		var calculadora = new Calculadora();
		var soma = calculadora.somar(2, 3);
		assertEquals(5, soma);
	}

}
