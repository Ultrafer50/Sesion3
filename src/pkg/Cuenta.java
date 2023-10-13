package pkg;

import java.util.List;

public class Cuenta {

	public String numero;
	public String titular;
	public double saldo;
	public List<Movimiento> movimientos; 
	
	
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
