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

    public int nombre;
    String imagen1;
    String imagen2;
    String imagen3;
    public boolean llegada;
    public Nodo izq;
    public Nodo der;
<<<<<<< HEAD

=======
>>>>>>> 0484f0d25a4f4ec1236742d9c697a2ef45dd01af

    public Nodo(int nombre, String imagen1, String imagen2, String imagen3, Nodo izq, Nodo der) {
        this.nombre = nombre;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.llegada = false;
        this.izq = izq;
        this.der = der;
    }

}
