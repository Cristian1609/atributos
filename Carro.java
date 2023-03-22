package Atributos;

/**
 *
 * @CristianAdolfoEstradaLindarte_02210132001
 */
public class Carro {

    private String placa;
    private String color;
    private int modelo;
    private String carroceria;
    private String funcionamiento;//tipo combustion
    private double precio;
    private double capacidad;//peso

    public Carro() {
    }

    public Carro(String placa, String color, int modelo, String carroceria, String funcionamiento, double precio, double capacidad) {
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.carroceria = carroceria;
        this.funcionamiento = funcionamiento;
        this.precio = precio;
        this.capacidad = capacidad;
    }

}
