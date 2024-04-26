
public class Numeros {
    public static void main (String args []){
        //Realiza una conversión explicita
        //esto produce como resultado -127 como error
        byte numeroByte =(byte) 129;
        System.out.println("numeroByte = " + numeroByte);
        
        //obtener los valores admitidos por el tipo de variable
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt =  2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        //Se coloca la L par evitar el error integer number too large
        long numeroLong =  9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        
    }
}
