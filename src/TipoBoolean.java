public class TipoBoolean {
    public static void main(String args []){
        
        boolean varBandera = true;
        System.out.println("varBandera = " + varBandera);
        
        if(varBandera){
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 17;
        var mayorEdad = edad >= 18;
        
        if(mayorEdad){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
