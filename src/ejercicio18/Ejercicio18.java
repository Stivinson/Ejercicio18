package ejercicio18;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Stivinson
 */
public class Ejercicio18 {

    Scanner lector=new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion direccion=new Direccion();
        direccion.leer_nombre();
        direccion.nueva_direccion();
        direccion.mostrar_nombre();
    }
    
}
