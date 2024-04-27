
public class TipoChar {
    public static void main(String args[]){
        
//        Se puede declarar con su codigo unicode
        char Char = '\u0021';
        System.out.println("Char = " + Char);
        //Con su representación decimal
        char CharDecimal = 33;
        System.out.println("CharDecimal = " + CharDecimal);
        //Se puede declarar con su simbolo
        char CharSimbolo = '!';
        System.out.println("CharSimbolo = " + CharSimbolo);       
        
//        INFERECIA DE TIPOS

//        Se puede declarar con su codigo unicode
        var Char2 = '\u0021';
        System.out.println("Char = " + Char2);
//        NO LO INFIERE COMO CHAR SINO COMO ENTERO
        var CharDecimal2 = 33;
        System.out.println("CharDecimal = " + CharDecimal2);
//        Se puede declarar con su simbolo
        var CharSimbolo2 = '!';
        System.out.println("CharSimbolo = " + CharSimbolo2);

    }
}
