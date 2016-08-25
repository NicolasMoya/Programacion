package cajero;

import java.util.Scanner;

public class Cliente {

	private int Num_Cliente;
	private int Identificacion;
	private String Nombre;
	private String Direccion;
	private int Telefono;
        
        

	public void IngresarClave() {
            int a ;
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese clave");
             a = leer.nextInt();
            if(a!= Identificacion){
                System.out.println("clave incorrecta");
                a = leer.nextInt();
                
                
            }else 
                System.out.println("Clave correcta");
                
	}

	public void ElegirOpciones() {
		// TODO - implement Cliente.ElegirOpciones
		throw new UnsupportedOperationException();
	}

	public void IndicarvalorARetirar(){
            int sacardinero;
            int dineroactual;
            Cuenta caj= new Cuenta();
            
            caj.getSaldo()=dineroactual;
            
            
	}

}