package cajero;

import java.util.Date;
import java.util.GregorianCalendar;

public class Tarjeta {

	private int NumTarjeta;
	private int NumCuenta;
	private int NumCliente;
	private Date FechadeExpiracion;
        private Cuenta Cuenta;

    public Tarjeta(int NumTarjeta, int NumCuenta, int NumCliente, Date FechadeExpiracion,Cuenta cuenta) {
        this.NumTarjeta = NumTarjeta;
        this.NumCuenta = NumCuenta;
        this.NumCliente = NumCliente;
        this.FechadeExpiracion = FechadeExpiracion;
        this.Cuenta = Cuenta;
    }

    public int getNumTarjeta() {
        return NumTarjeta;
    }


    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getNumCliente() {
        return NumCliente;
    }

    public void setNumCliente(int NumCliente) {
        this.NumCliente = NumCliente;
    }

    public Date getFechadeExpiracion() {
        return FechadeExpiracion;
    }
    public void setFechadeExpiracion(){
        
        
    }

   
        
        
        

} 
