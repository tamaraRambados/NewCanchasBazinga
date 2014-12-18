package org.bazinga.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.Collection;
import java.util.List;

@Entity
public class UsuarioDueño extends Usuario{


   @ManyToMany(mappedBy="usuarioDueños",fetch=FetchType.LAZY)
    private List<Establecimiento> establecimientos;
    
    @OneToMany(fetch=FetchType.LAZY)
    private List<EstadoCuenta> estadoCuentas;

   public List<Establecimiento> getEstablecimientos() {
        return establecimientos;
    }
    public void setEstablecimientos(List<Establecimiento> establecimientos) {
        this.establecimientos = establecimientos;
    }
    
    
    
}
