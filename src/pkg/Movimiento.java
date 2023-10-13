package pkg;

public class Movimiento {
	public double importe;
	public TipoMovimiento signo;
	public String detalle;

	public Movimiento(double importe, TipoMovimiento signo, String detalle) {
		super();
		this.importe = importe;
		this.signo = signo;
		this.detalle = detalle;
	}
}
