/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LogicaCliente;

import LogicaNegocio.Asignatura;
import java.util.Scanner;

/**
 *
 * @author jarol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaramos las variables
        String Nombre="";
        float Taller=0;
        float Quiz=0;
        float Parcial=0;
        float porcentaje1=0.2f;
        float porcentaje2=0.3f;
        float porcentaje3=0.5f;
                
                
        //creamos el objeto
        Asignatura objasignatura=new Asignatura();
        //insertamos el scanner para poder pedir por teclado
        Scanner scan=new Scanner(System.in);
        
        //Pedimos la información por teclado
        System.out.println("Ingrese el nombre de la asignatura");
        Nombre=scan.nextLine();
        objasignatura.setNombre(Nombre);
        
        System.out.println("Ingrese la nota del taller");
        Taller=scan.nextFloat();
        objasignatura.setTaller(Taller);
        
        System.out.println("Ingrese la nota del Quiz");
        Quiz=scan.nextFloat();
        objasignatura.setQuiz(Quiz);
        
        System.out.println("Ingrese la nota del parcial");
        Parcial=scan.nextFloat();
        objasignatura.setParcial(Parcial);
        //realizamos la operación
        float resultado=porcentaje1*objasignatura.getTaller()+porcentaje2*objasignatura.getQuiz()+porcentaje3*objasignatura.getParcial();
 
        //imprimimos los resultados
        System.out.println("El nombre de la asignatura es:"+"\t"+objasignatura.getNombre());
        System.out.println("La nota final en la asigunatura de"+" "+objasignatura.getNombre()+"="+" "+resultado);
    }
    
}
