package Atributos;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class Persona {

    private String nombreCompleto;
    private String direccion;
    private String genero;
    private String correo;
    private String estadoCivil;
    private String ocupacion;
    private String peso;
    private String colorOjos;
    private String colorCabello;
    private String nacionalidad;
    private String tipoSangre;
    private String tipo_id;
    private String fechaNacimiento;//edad
    private String etnia;

    private int Nidentificacion;
    private int numeroCelular;
    private double estatura;

    public Persona() {
    }

    public Persona(String nombreCompleto, String direccion, String genero, String correo, String estadoCivil, String ocupacion, String peso, String colorOjos, String colorCabello, String nacionalidad, String tipoSangre, String tipo_id, String fechaNacimiento, String etnia, int Nidentificacion, int numeroCelular, double estatura) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.genero = genero;
        this.correo = correo;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.peso = peso;
        this.colorOjos = colorOjos;
        this.colorCabello = colorCabello;
        this.nacionalidad = nacionalidad;
        this.tipoSangre = tipoSangre;
        this.tipo_id = tipo_id;
        this.fechaNacimiento = fechaNacimiento;
        this.etnia = etnia;
        this.Nidentificacion = Nidentificacion;
        this.numeroCelular = numeroCelular;
        this.estatura = estatura;
    }

}
