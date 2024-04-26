/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jmdel
 */
public class Concatenacion {

    public static void main(String args[]) {
        var usuario = "Juanchi";
        var titulo = "Ingeniero";

        var union = usuario + " " + titulo;
        System.out.println("Union = " + union);
        
        var i = 3;
        var j = 4;
        
        //Se realiza la  suma
        System.out.println(i + j);
        //Evaluación de izq a der
        //realiza la suma y luego concatena
        System.out.println(i + j + usuario);
        //Concatena
        System.out.println(usuario + i + j);
        //Los parentesis aumentan la prioridad
        //Se realiza la suma y después concatena
        System.out.println(usuario + ( i + j));
    }
}
