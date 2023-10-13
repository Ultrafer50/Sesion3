package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;
import pkg.Movimiento;
import pkg.TipoMovimiento;

class CuentaTest {
	static Cuenta ctaPruebas;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// 1º crear una instancia de Cuenta
		ctaPruebas = new Cuenta(0);
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
		ctaPruebas.ingresar(5000);
		// 3º el saldo de la cuenta se ha incrementado
		assertEquals(5000, ctaPruebas.getSaldo());
	}
	
	@Test
	void testRetirar() {
		ctaPruebas.ingresar(5000);
		ctaPruebas.retirar(2000);
		assertEquals(3000, ctaPruebas.getSaldo());
	}
	
	@Test
	void testIngresarMovimiento() {
		Movimiento m = new Movimiento(5000, TipoMovimiento.D, "Ingreso de 5000");
		ctaPruebas.ingresar(5000, "Ingreso de 5000");
		assertEquals(m, ctaPruebas.movimientos.get(0));
		assertEquals(5000, ctaPruebas.getSaldo());
	}

}
