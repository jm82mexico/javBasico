public class InferenciaNumeros {
    public static void main (String args []){
       
        //Al declarar un numero por default lo crea como int
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        //Se usa la letra L para especificar que se trata de un long
        var numeroLong = 10L;
        System.out.println("numeroLong = " + numeroLong);
        //Al crear un flotante por default lo crea como double
        var numeroDouble = 10.5;
        System.out.println("numeroDouble = " + numeroDouble);        
        //Se usa la letra F para especificar que se trar de un float
        var numeroFloat = 10.1F;
        System.out.println("numeroFloat = " + numeroFloat);
        
    }
}
