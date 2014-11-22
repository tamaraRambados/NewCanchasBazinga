package org.bazinga.servicios.imp;

import org.bazinga.entities.Cancha;
import org.bazinga.service.ICancha;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CanchaService{


    @PersistenceContext(unitName = "cancha-pu")
    private EntityManager entityManager;

	//@Override
	public boolean alta(Cancha cancha) {
		// TODO Auto-generated method stub
		return false;
	}

	///@Override
	public boolean baja(Cancha cancha) {
		// TODO Auto-generated method stub
		return false;
	}

	//@Override
	public boolean modificar(Cancha cancha) {
		// TODO Auto-generated method stub
		return false;
	}

}
