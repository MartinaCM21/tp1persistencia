package entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "tipo_envio")
    private String tipoEnvio;

    @Column(name = "total")
    private Double total;

    @OneToOne
    private Factura factura;

    @OneToMany
    private DetallePedido detallePedido;

    public Pedido(int idPedido, String estado, Date fecha, String tipoEnvio, Double total, Factura factura, DetallePedido detallePedido) {
        this.idPedido = idPedido;
        this.estado = estado;
        this.fecha = fecha;
        this.tipoEnvio = tipoEnvio;
        this.total = total;
        this.factura = factura;
        this.detallePedido = detallePedido;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public Double getTotal() {
        return total;
    }

    public Factura getFactura() {
        return factura;
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }
}
