package entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import java.util.Date;
@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_factura;

    @Column(name = "numero")
    private int numero;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "descuento")
    private double descuento;

    @Column(name = "forma_pago")
    private String formaPago;

    @Column(name = "total")
    private int total;

    public Factura() {
    }

    public Factura(int id_factura, int numero, Date fecha, double descuento, String formaPago, int total) {
        this.id_factura = id_factura;
        this.numero = numero;
        this.fecha = fecha;
        this.descuento = descuento;
        this.formaPago = formaPago;
        this.total = total;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
