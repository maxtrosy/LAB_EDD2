/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_edd2;

/**
 *
 * @author maxtr
 */
public class Nodo {

    String nombre;
    String imagen1;
    String imagen2;
    String imagen3;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(String nombre, String imagen1, String imagen2, String imagen3, Nodo izquierda, Nodo derecha) {
        this.nombre = nombre;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    
}
