/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos;

/**
 *
 * @author USUARIO
 */
public class Mascota {
    
    private String propietario;
    private String tipoMascota;
    private String raza;
    private String fechaNacimiento;//edad
    private String color;
     private String sexo;
     private int longitud;

    public Mascota() {
    }

    public Mascota(String propietario, String tipoMascota, String raza, String fechaNacimiento, String color, String sexo, int longitud) {
        this.propietario = propietario;
        this.tipoMascota = tipoMascota;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.color = color;
        this.sexo = sexo;
        this.longitud = longitud;
    }
     
}
