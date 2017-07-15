package clases;

import java.util.List;

/**
 * Created by PC on 13/07/2017.
 */
public class Propietario {
    private Integer codigo;
    private String nombre;
    private Integer edad;
    private String sexo;
    private Vehiculo[]vehiculos;
    private List<Infraccion> infracciones;
    private List<Piloto> pilotos;

    public Propietario(int cantidad) {
        vehiculos = new Vehiculo[cantidad];
    }


    public Propietario(Integer codigo, String nombre, Integer edad, String sexo, Vehiculo[] vehiculos, List<Infraccion> infracciones, List<Piloto> pilotos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.vehiculos = vehiculos;
        this.infracciones = infracciones;
        this.pilotos = pilotos;
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

    public String getSexo(String sexPropietario) {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Infraccion> getInfracciones() {
        return infracciones;
    }

    public void setInfracciones(List<Infraccion> infracciones) {
        this.infracciones = infracciones;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public void agregarVehiculo(Vehiculo vehiculo, int posicion, int limite){
        if (posicion < limite){
            this.vehiculos[posicion] = vehiculo;
        }else{
            System.out.println("no se puede agregar mas vehiculos");
        }

    }

    @Override
    public String toString() {
        return "Propietario{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", vehiculos=" + vehiculos.length +
                ", infracciones=" + infracciones +
                ", pilotos=" + pilotos +
                '}';
    }

}
