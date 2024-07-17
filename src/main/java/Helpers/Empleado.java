/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author PC
 */
public class Empleado {

    // Nombre del empleado, edad y salario
    private String nombre;
    private int edad;
    private int salario;
    
    public Empleado (String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimirnombre(){
        System.out.println(nombre);
    }
    
    public void estableceredad(int _edad){
        this.edad = _edad;
    }
    public int obteneredad(){
        return edad;
    }
     public void establecersalario(int _salario){
        this.salario = _salario;
    }
    public int obtenersalario(){
        return salario;
    }
}
