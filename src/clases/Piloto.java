package clases;

/**
 * Created by PC on 13/07/2017.
 */
public class Piloto {
    private Integer codigo;
    private String nombre;
    private Integer edad;
    private String tipoLicencia;

    public Piloto() {
    }

    public Piloto(Integer codigo, String nombre, Integer edad, String tipoLicencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoLicencia = tipoLicencia;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipoLicencia='" + tipoLicencia + '\'' +
                '}';
    }
}
