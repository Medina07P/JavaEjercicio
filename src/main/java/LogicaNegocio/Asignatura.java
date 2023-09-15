/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author jarol
 */
public class Asignatura {
    //atributos
    public String Nombre;
    public float Taller;
    public float Quiz;
    public float Parcial;
    
    //constructor no parametrizado
    public Asignatura (){
    
    }

    public Asignatura(String Nombre, float Taller, float Quiz, float Parcial) {
        this.Nombre = Nombre;
        this.Taller = Taller;
        this.Quiz = Quiz;
        this.Parcial = Parcial;
    }
    //setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTaller(float Taller) {
        this.Taller = Taller;
    }

    public void setQuiz(float Quiz) {
        this.Quiz = Quiz;
    }

    public void setParcial(float Parcial) {
        this.Parcial = Parcial;
    }
    //getters

    public String getNombre() {
        return Nombre;
    }

    public float getTaller() {
        return Taller;
    }

    public float getQuiz() {
        return Quiz;
    }

    public float getParcial() {
        return Parcial;
    }
    
    
}
