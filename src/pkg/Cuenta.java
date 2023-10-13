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

	public void ingresar(double ingreso) {
		ingresar(ingreso, "");
	}
	
	public void ingresar(double ingreso, String detalle) {
		movimientos.add(new Movimiento(ingreso, TipoMovimiento.D, detalle));
		setSaldo(ingreso);
	}

	public void retirar(double reintegro) {
		setSaldo(getSaldo() - reintegro);
	}
	
	public void retirar(double reintegro, String detalle) {
		movimientos.add(new Movimiento(2000, TipoMovimiento.H, "Reintegro de 2000"));
		setSaldo(3000);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
