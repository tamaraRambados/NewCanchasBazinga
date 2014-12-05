package org.bazinga.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name='UsuarioId',referencedColumnName = 'UsuarioId')
    private Usuario usuario;

    private Date FechaReserva;
    private Date FechaAlquiler;
    private Estado estado;
    private double importe;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaReserva() {
        return FechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        FechaReserva = fechaReserva;
    }

    public Date getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        FechaAlquiler = fechaAlquiler;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}

enum Estado{
    Reservado,
    Pagado,
    Libre
}