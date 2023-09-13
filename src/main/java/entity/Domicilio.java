package entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;


@Entity
@Table(name = "domicilio")
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDomicilio;

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private String numero;

    @Column(name = "localidad")
    private String localidad;

    public Domicilio() {
    }

    public Domicilio(int idDomicilio, String calle, String numero, String localidad) {
        this.idDomicilio = idDomicilio;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
