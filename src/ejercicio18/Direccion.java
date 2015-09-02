package ejercicio18;

/**
 *
 * @author Stivinson
 */
public class Direccion extends Nombre{
    
    private String calle;
    private String ciudad;
    private String provincia;
    private String postal;
    
    public Direccion(){
    super();   
    }
    
    public Direccion(String nombre,String primerA, String segundoA, String calle,String ciudad,String provincia,String postal){
      super(nombre,primerA,segundoA);
      this.calle=calle;
      this.ciudad=ciudad;
      this.provincia=provincia;
      this.postal=postal;
    }

  /*  @Override
    public void leer_nombre() {
        super.leer_nombre(); //To change body of generated methods, choose Tools | Templates.
    }*/
    @Override
    public void mostrar_nombre() {
    super.mostrar_nombre(); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Calle: "+calle);
    System.out.println("Ciudad: "+ciudad);
    System.out.println("Provincia: "+provincia);
    System.out.println("Postal: "+postal);
    }
    public void nueva_direccion(){
    System.out.println("Ingrese la calle: ");calle=lector.next();
    System.out.println("Ingrese la ciudad: ");ciudad=lector.next();
    System.out.println("Ingrese la provincia: ");provincia=lector.next();
    System.out.println("Ingrese la postal: ");postal=lector.next();
        }  
    
   }
