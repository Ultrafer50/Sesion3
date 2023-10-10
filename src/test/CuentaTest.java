package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	Cuenta ctaPruebas;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// 1º crear una instancia de Cuenta
		ctaPruebas = new Cuenta();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		// 2º realizar un ingreso en la Cuenta
		ctaPruebas.ingresar(5000f);
		// 3º el saldo de la cuenta se ha incrementado
		assertEquals(5000f, ctaPruebas.getSaldo());
	}
	
	@Test
	void testRetirar() {
		ctaPruebas.retirar(2000f);
		assertEquals(3000f, ctaPruebas.getSaldo());
	}

}
