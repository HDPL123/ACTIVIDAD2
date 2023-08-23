/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
public class Circulo {
    private double radio;
    private String color;

    // Constructor predeterminado
    public Circulo() {
        this.radio = 5.0;
        this.color = "azul";
    }

    // Constructor sobrecargado
    public Circulo(double radio) {
        this.radio = radio;
        this.color = "azul";
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }
}
