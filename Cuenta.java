package cajero;

public class Cuenta {

	private int NumCuenta;
	private int NumCliente;
	private String Tipodecuenta;

    public Cuenta() {
    }
	private double Saldo;

    public Cuenta(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

        
    
        
	public void ConsultarCuenta() {
		// TODO - implement Cuenta.ConsultarCuenta
		throw new UnsupportedOperationException();
	}

}