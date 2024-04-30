package junit;

public class Calculadora {
	
	private int num1;
	private int num2;
		
	 public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int suma() {
	       return num1 + num2;
	   }
	   public int resta() {
	       return num1 - num2;
	   }
	   public int multiplicacion() {
	       return num1 * num2;
	   }
	   public int division() {
	       if (num2 == 0) {
	           throw new ArithmeticException("No se puede dividir entre cero");
	       }
	       return num1 / num2;
	   }
	}
