package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	public String numero;
	public String titular;
	public double saldo;
	public List<Movimiento> movimientos; 
	
	
	public Cuenta(double saldo) {
		movimientos = new ArrayList<Movimiento>();
		this.saldo = saldo;
	}

	public void ingresar(float ingreso) {
		setSaldo(ingreso);
	}
	
	public void ingresar(float ingreso, String detalle) {
		movimientos.add(new Movimiento(ingreso, TipoMovimiento.D, detalle));
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
