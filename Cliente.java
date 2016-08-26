package cajero;

import java.util.Scanner;

public class Cliente {

	private int Num_Cliente;
	private int Identificacion;
	private String Nombre;
	private String Direccion;
	private int Telefono;
        Scanner leer = new Scanner(System.in);
        

	public void IngresarClave() {
            int a ;
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
            System.out.println("Dinero actual : "+dineroactual);
            System.out.println("ingrese valor a retirar :");
            sacardinero = leer.nextInt();
            if(dineroactual<sacardinero || sacardinero>0){
            	System.out.println("saldo insuficiente, ingrese nuevamente el monto");
            		sacardinero = leer.nextInt();
            }else
           	caj.setSaldo(dineroactual-sacardinero);
	}

}
