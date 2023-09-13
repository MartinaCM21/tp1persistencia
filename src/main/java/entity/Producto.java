package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "tiempo_estimado_cocina")
    private int tiempoEstimadoCocina;

    @Column( name = "denominacion")
    private String denominacion;

    @Column(name = "precio_venta")
    private double precioVenta;

    @Column(name = "precio_compra")
    private double precioCompra;

    @Column(name = "stock_actual")
    private int stockActual;

    @Column(name = "stock_minimo")
    private int stockMinimo;

    @Column(name = "unidad_medida")
    private String unidadMedida;

    @Column(name = "receta")
    private String receta;

    public Producto() {
    }

    public Producto(int idProducto, String tipo, int tiempoEstimadoCocina, String denominacion, double precioVenta, double precioCompra, int stockActual, int stockMinimo, String unidadMedida, String receta) {
        this.idProducto = idProducto;
        this.tipo = tipo;
        this.tiempoEstimadoCocina = tiempoEstimadoCocina;
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.unidadMedida = unidadMedida;
        this.receta = receta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTiempoEstimadoCocina() {
        return tiempoEstimadoCocina;
    }

    public void setTiempoEstimadoCocina(int tiempoEstimadoCocina) {
        this.tiempoEstimadoCocina = tiempoEstimadoCocina;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }
}
