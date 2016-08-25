package cajero;

import java.util.Date;

public class Tarjeta {

	private int NumTarjeta;
	private int NumCuenta;
	private int NumCliente;
	private Date FechadeExpiracion;

    public Tarjeta(int NumTarjeta, int NumCuenta, int NumCliente, Date FechadeExpiracion) {
        this.NumTarjeta = NumTarjeta;
        this.NumCuenta = NumCuenta;
        this.NumCliente = NumCliente;
        this.FechadeExpiracion = FechadeExpiracion;
    }
        
        
        

} 