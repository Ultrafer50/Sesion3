package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	public String numero;
	public String titular;
	public double saldo;
	public List<Movimiento> movimientos; 
	
	public Cuenta(String numero, String titular, double saldo) {
		this.movimientos = new ArrayList<Movimiento>();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void ingresar(double ingreso) {
		ingresar(getSaldo() + ingreso, "");
	}
	
	public void ingresar(double ingreso, String detalle) {
		movimientos.add(new Movimiento(ingreso, TipoMovimiento.D, detalle));
		setSaldo(getSaldo() + ingreso);
	}

	public void retirar(double reintegro) {
		retirar(reintegro, "");
	}
	
	public void retirar(double reintegro, String detalle) {
		double saldo_nuevo = getSaldo() - reintegro;
		if (saldo_nuevo <= -500) {
			System.out.println("Operación no permitida - Límite de descubierto de 500€");
		} else {			
			movimientos.add(new Movimiento(reintegro, TipoMovimiento.H, detalle));
			setSaldo(getSaldo() - reintegro);		
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
