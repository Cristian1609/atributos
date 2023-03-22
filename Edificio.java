
package Atributos;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class Edificio {

    private String nombre;
    private String color;
    private String direccion;
    private int numeroCasas;
    private int numeroPisos;
    private int numeroVentanas;
    private int numeroPuertas;
    private int numeroascensores;
    private boolean esInteligente;
    private boolean tieneAscensor;

    public Edificio() {
    }

    public Edificio(String nombre, String color, String direccion, int numeroCasas, int numeroPisos, int numeroVentanas, int numeroPuertas, int numeroascensores, boolean esInteligente, boolean tieneAscensor) {
        this.nombre = nombre;
        this.color = color;
        this.direccion = direccion;
        this.numeroCasas = numeroCasas;
        this.numeroPisos = numeroPisos;
        this.numeroVentanas = numeroVentanas;
        this.numeroPuertas = numeroPuertas;
        this.numeroascensores = numeroascensores;
        this.esInteligente = esInteligente;
        this.tieneAscensor = tieneAscensor;
    }

    
}
