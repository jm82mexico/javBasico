
import java.util.Scanner;

public class DetalleLibro {
    public static void main (String args[]){
        System.out.println("Proporciona el titulo del libro: ");
        Scanner consola = new Scanner(System.in );
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = consola.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
