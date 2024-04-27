import java.util.Scanner;

public class ConversionTipos {

    public static void main(String args[]) {
//        Convertir un string en int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
//      Converir un string en double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Edad = " + edad);
//        Convertir un int en string
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
//      Extrae el carater de un string por su posición en el arreglo
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);

//      Extrae el carater de una entrada de consola
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(2);
        System.out.println("caracter = " + caracter);
        
    }
}
