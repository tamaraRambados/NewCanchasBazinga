package org.bazinga.entities;



import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@XmlRootElement(name="direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long DireccionId;

    @OneToMany
    private List<Usuario> listaUsuario;

    @OneToMany
    private List<Cancha> listaCancha;


}
