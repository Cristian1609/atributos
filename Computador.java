
package Atributos;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class Computador {
    
   
    private String modelo;
    private String procesador;
    private String sistemaOperativo;
    private String color;
    private String marca;
    private int RAM;
    private int capacidadDisco;
    private double longitudPantalla;
   

    public Computador() {
    }

    public Computador(String marca, String modelo, String procesador, String sistemaOperativo, String color, int RAM, int capacidadDisco, double longitudPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.color = color;
        this.RAM = RAM;
        this.capacidadDisco = capacidadDisco;
        this.longitudPantalla = longitudPantalla;
    }

    
    
    
    
    
}
