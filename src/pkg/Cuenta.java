package pkg;

public class Cuenta {

	private double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(float ingreso) {
		setSaldo(ingreso);
	}

	public void retirar(double reintegro) {
		setSaldo(getSaldo() - reintegro);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
