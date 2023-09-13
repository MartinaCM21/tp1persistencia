package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rubro")
public class Rubro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRubro;

    @Column(name = "denominacion")
    private String denominacion;

    @OneToMany
    private Producto producto;

    public Rubro() {
    }

    public Rubro(int idRubro, String denominacion, Producto producto) {
        this.idRubro = idRubro;
        this.denominacion = denominacion;
        this.producto = producto;
    }

    public int getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(int idRubro) {
        this.idRubro = idRubro;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
