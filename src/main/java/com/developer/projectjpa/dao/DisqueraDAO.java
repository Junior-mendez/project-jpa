/**
 * 
 */
package com.developer.projectjpa.dao;

import java.util.List;

import com.developer.projectjpa.entity.Disquera;

/**
 * @author Junior Mendez
 * Interfaz que genera el DAO para las transacciones del CRUD a la tabla disquera
 */
public interface DisqueraDAO {
	
	void guardar(Disquera disquera);
	void actualizar(Disquera disquera);
	void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);

}
