package clases;

/**
 * Created by PC on 13/07/2017.
 */
public class Vehiculo {
    private String placa;
    private String color;
    private String modelo;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String color, String modelo, String marca) {
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +                "placa='" + placa + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
