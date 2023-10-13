package pkg;

public class Cuenta {

	private double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(float f) {
		setSaldo(f);
	}

	public void retirar(double reingreso) {
		setSaldo(3000);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
