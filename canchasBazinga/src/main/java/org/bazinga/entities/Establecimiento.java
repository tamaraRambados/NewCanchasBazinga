package org.bazinga.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;
import java.util.Set;

@Entity
@XmlRootElement(name="establecimientos")
@NamedQuery(name= Establecimiento.FIND_ALL, query = "SELECT e FROM Establecimiento e")
public class Establecimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long EstablecimientoId;
    
    //relaciones
    
    @OneToMany(fetch=FetchType.LAZY)
    private List<Cancha> listacanchas;
    @ManyToOne
    private Direccion direccion;
    @ManyToMany
    private List<UsuarioDueño> usuarioDueños;
    
    
    @NotNull
    private String nombre;
    private Integer telefono;
   

    public static final String FIND_ALL= "Establecimiento.findAll";


    public long getEstablecimientoId() {
        return EstablecimientoId;
    }

    public void setEstablecimientoId(long establecimientoId) {
        EstablecimientoId = establecimientoId;
    }

    

    public List<Cancha> getListacanchas() {
        return listacanchas;
    }

    public void setListacanchas(List<Cancha> listacanchas) {
        this.listacanchas = listacanchas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public List<UsuarioDueño> getUsuarioDueños() {
        return usuarioDueños;
    }

    public void setUsuarioDueños(List<UsuarioDueño> usuarioDueños) {
        this.usuarioDueños = usuarioDueños;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }


    
}
