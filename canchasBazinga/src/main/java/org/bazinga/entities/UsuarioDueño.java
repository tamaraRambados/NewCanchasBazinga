package org.bazinga.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class UsuarioDueño extends Usuario{


    @ManyToMany(mappedBy="usuarioDueños")
    private List<Establecimiento> establecimientos;

    public List<Establecimiento> getEstablecimientos() {
        return establecimientos;
    }

    public void setEstablecimientos(List<Establecimiento> establecimientos) {
        this.establecimientos = establecimientos;
    }
    
    
    
}
