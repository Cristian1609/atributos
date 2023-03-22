package Atributos;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class Ciudad {

    private String pais;//territorio al que pertenece
    private String nombre;
    private int longitud;//espacio que ocupa
    private int Npoblacion;
    private int clima;

    public Ciudad() {
    }

    public Ciudad(String pais, String nombre, int longitud, int Npoblacion, int clima) {
        this.pais = pais;
        this.nombre = nombre;
        this.longitud = longitud;
        this.Npoblacion = Npoblacion;
        this.clima = clima;
    }

    
}
