package org.bazinga.rest;

import org.bazinga.entities.Cancha;
import org.bazinga.service.ICancha;
import org.bazinga.servicios.imp.CanchaService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

import java.util.List;
@Path("canchas")
public class CanchaRESTService implements ICancha{


    @Inject
    CanchaService canchaService;
    
    
    @Override
    public boolean alta(Cancha cancha) {
        return false;
    }

    @Override
    public boolean baja(Cancha cancha) {
        return false;
    }

    @Override
    public boolean modificar(Cancha cancha) {
        return false;
    }
  	
    @Override
    public Response registrar(Cancha cancha) {
        return null;
    }
    
    
    @POST
  	@Path("registrar")	
    public Response registrar1() {
        Cancha c= new Cancha();
        c.setCodigo(1);
        c.setDireccion("Sarmiento");
        c.setLocalidad("Resitencia");
        c.setNombre("Sarmiento");
        c.setPais("Argentina");
        c.setProvincia("Chaco");
        c.setTelefono(364);
        c.setTipo("2");
        return (Response) canchaService.registrar(c);
    }
    
    @GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Cancha> getAllCancha() {
        
    	return canchaService.getAllCancha();
    }
}
