package cajero;



public class Cliente {

	private int Num_Cliente;
	private int Identificacion;
	private String Nombre;
	private String Direccion;
	private int Telefono;
        private Tarjeta tarjeta[];
        private Cuenta cuenta[];

    public Cliente(int Num_Cliente, int Identificacion, String Nombre, String Direccion, int Telefono) {
        this.Num_Cliente = Num_Cliente;
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
        

	public void IngresarClave() {
                
                System.out.println("Ingrese su clave");
                
                
            /*System.out.println("Ingrese clave");
             a = leer.nextInt();
             if(a!= Identificacion){
             do{
                System.out.println("clave incorrecta");
                a = leer.nextInt();
                
                
            }while(a!= Identificacion);
             }else
        System.out.println("Clave correcta");
              */  
	}

	public void ElegirOpciones() {
		// TODO - implement Cliente.ElegirOpciones
		throw new UnsupportedOperationException();
	}

	public void IndicarvalorARetirar(){
       /*int sacardinero;
            int dineroactual;
            Cuenta caj= new Cuenta();
            
            caj.getSaldo()=dineroactual;
            System.out.println("Dinero actual : "+dineroactual);
            System.out.println("ingrese valor a retirar :");
            
            if(dineroactual<sacardinero || sacardinero>0){
            	System.out.println("saldo insuficiente, ingrese nuevamente el monto");
            		
            }else
           	caj.setSaldo(dineroactual-sacardinero);
         */   
	}

}
