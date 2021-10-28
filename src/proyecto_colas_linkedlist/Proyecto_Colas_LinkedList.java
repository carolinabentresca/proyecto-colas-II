/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_colas_linkedlist;

import java.util.LinkedList;

public class Proyecto_Colas_LinkedList {

    public static void main(String[] args) {
        /* Creamos la cola con diferentes tipos de datos */
        LinkedList cola = new LinkedList();

        /* Insertamos datos a la cola */
        cola.offer(10);
        cola.offer(20);
        cola.offer(30);
        cola.offer(40);
        cola.offer(50);
        cola.offer(10.000);
        cola.offer(20.000);
        cola.offer("Caden1");
        cola.offer("Cadena2");
        cola.offer("Cadena3");

        /* Imprimimos la cola llena */
        System.out.println("Cola llena :" + cola);

        /* Desencolamos y el valor lo comparamos con null */
        while (cola.poll() != null) {
            System.out.println(cola.peek()); // Muestra el Nuevo Frente
        }

        /* Nuevo Frente, Muestra null, la cola está vacia */
        System.out.println("Nuevo Frente :" + cola.peek());

    }

}
