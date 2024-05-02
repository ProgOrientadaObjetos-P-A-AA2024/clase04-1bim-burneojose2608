/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        Hospital h1 = new Hospital("Militar", "Loja",
                1000, 3000);

        h1.establecerNombre("Hospital Militar Privado");
        h1.establecerNumeroDoctores(1000);
        h1.establecerNumeroEnfermeros(3000);

        Hospital h2 = new Hospital("Militar DOS", "Loja",
                1000, 3000);
        h2.establecerNombre("Hospital Militar dos");
        h2.establecerNumeroDoctores(1000);
        h2.establecerNumeroEnfermeros(3000);

        System.out.printf("%s\n Numero de docotres :%d\n Numero de Enfermeros%d\n"
                + " \n ", h1.obtenerNombre(),
                h1.obtenerNumeroDoctores(), h1.obtenerNumeroEnfermeros());
        System.out.printf("%s\n  Numero de docotres %d\n Numero de Enfermeros"
                + "%d\n ", h2.obtenerNombre(),
                h2.obtenerNumeroDoctores(), h2.obtenerNumeroEnfermeros());

    }
}
