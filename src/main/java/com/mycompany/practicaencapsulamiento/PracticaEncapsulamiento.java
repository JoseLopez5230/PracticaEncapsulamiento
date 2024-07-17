/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaencapsulamiento;

import Helpers.Empleado;

/**
 *
 * @author PC
 */
public class PracticaEncapsulamiento {
    public static void main (String [] args){

  // Instanciar la clase Empleado
    Empleado empleado = new Empleado ("Jose Lopez");
    empleado.imprimirnombre();

    // Establecer valor a la variable edad
    empleado.estableceredad(21);
     empleado.establecersalario(4000);
    
    // Imprimir el valor de una variable privada
    System.out.println(empleado.obteneredad());
     System.out.println(empleado.obtenersalario());
}
}