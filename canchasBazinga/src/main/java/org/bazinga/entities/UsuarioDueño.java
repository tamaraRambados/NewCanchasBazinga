package org.bazinga.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class UsuarioDueño extends Usuario{

    @ManyToMany
    private List<Establecimiento> listaEstablecimientos;

    public List<Establecimiento> getListaEstablecimientos() {
        return listaEstablecimientos;
    }

    public void setListaEstablecimientos(List<Establecimiento> listaEstablecimientos) {
        this.listaEstablecimientos = listaEstablecimientos;
    }

    @ManyToMany(mappedBy = "usuarioDueños")
    private Collection<Establecimiento> establecimientos;

    public Collection<Establecimiento> getEstablecimientos() {
        return establecimientos;
    }

    public void setEstablecimientos(Collection<Establecimiento> establecimientos) {
        this.establecimientos = establecimientos;
    }
}
