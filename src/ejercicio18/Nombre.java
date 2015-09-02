package ejercicio18;
import java.util.Scanner;
/**
 *
 * @author Stivinson
 */
public class Nombre {
    
    private String nombre;
    private String primerA;
    private String segundoA;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerA() {
        return primerA;
    }
    public void setPrimerA(String primerA) {
        this.primerA = primerA;
    }
    public String getSegundoA() {
        return segundoA;
    }
    public void setSegundoA(String segundoA) {
        this.segundoA = segundoA;
    }
    
    public Nombre(){
        
    }
    public Nombre(String nombre,String primerA,String segundoA){
        this.nombre=nombre;
        this.primerA=primerA;
        this.segundoA=segundoA;
    }
    Scanner lector=new Scanner(System.in);
    
    public void leer_nombre(){        
        System.out.println("Ingrese el nombre: ");nombre=lector.next();
        System.out.println("Ingrese el Primer Apellido: ");primerA=lector.next();
        System.out.println("Ingrese el Segundo Apellido: ");segundoA=lector.next();
    }
    public void mostrar_nombre(){
        
      System.out.println("Nombre: "+nombre+" "+primerA+" "+segundoA);  
        
    }
    
}
