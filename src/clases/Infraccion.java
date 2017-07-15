package clases;

import java.util.Date;

/**
 * Created by PC on 13/07/2017.
 */
public class Infraccion {
    private Integer codigo;
    private String descripcion;
    private double monto;
    private Date fecha;

    public Infraccion() {
    }

    public Infraccion(Integer codigo, String descripcion, double monto, Date fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Infraccion{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                ", fecha=" + fecha +
                '}';
    }
}
