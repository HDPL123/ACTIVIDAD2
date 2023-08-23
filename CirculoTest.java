/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class CirculoTest {
    public static void main(String[] args) {
        // Utilizando un constructor por defecto
        Circulo circulo1 = new Circulo();
        System.out.println("Radio del círculo 1: " + circulo1.getRadio());
        System.out.println("Área del círculo 1: " + circulo1.getArea());

        System.out.println();

        // Utilizando un constructor sobrecargado con radio igual a 6
        Circulo circulo2 = new Circulo(6.0);
        System.out.println("Radio del círculo 2: " + circulo2.getRadio());
        System.out.println("Área del círculo 2: " + circulo2.getArea());
    }
}
