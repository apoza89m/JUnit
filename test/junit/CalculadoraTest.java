package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		// dos positivos
		Calculadora c1 = new Calculadora(5,2);
		assertAll(
				() -> assertEquals(7,c1.suma()),
				() -> assertEquals(3,c1.resta()),
				() -> assertEquals(10,c1.multiplicacion()),
				() -> assertEquals(2,c1.division())
				);
		// el primero negativo
		Calculadora c2 = new Calculadora(-5,2);
		assertAll(
				() -> assertEquals(-3,c2.suma()),
				() -> assertEquals(-7,c2.resta()),
				() -> assertEquals(-10,c2.multiplicacion()),
				() -> assertEquals(-2,c2.division())
				);
		// el segundo negativo
		Calculadora c3 = new Calculadora(5,-2);
		assertAll(
				() -> assertEquals(3,c3.suma()),
				() -> assertEquals(7,c3.resta()),
				() -> assertEquals(-10,c3.multiplicacion()),
				() -> assertEquals(-2,c3.division())
				);
		// dos negativos
		Calculadora c4 = new Calculadora(-5,-2);
		assertAll(
				() -> assertEquals(-7,c4.suma()),
				() -> assertEquals(-3,c4.resta()),
				() -> assertEquals(10,c4.multiplicacion()),
				() -> assertEquals(2,c4.division())
				);
		// division por cero
		Calculadora c5 = new Calculadora(8,0);
		assertAll(
				() -> assertEquals(8,c5.suma()),
				() -> assertEquals(8,c5.resta()),
				() -> assertEquals(0,c5.multiplicacion()),
				() -> assertThrows(ArithmeticException.class, () -> c5.division(), "Lanza ArithmeticException")
				);
	}

}
