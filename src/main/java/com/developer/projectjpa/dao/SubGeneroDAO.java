/**
 * 
 */
package com.developer.projectjpa.dao;

import java.util.List;

import com.developer.projectjpa.entity.SubGenero;

/**
 * @author Junior Mendez
 * Interface DAO que realiza el CRUd para la tabla SubGenero.
 */
public interface SubGeneroDAO {
	/**
	 * Metodo que permite guardar un subgenero 
	 * @param subGenero {@link SubGenero} objeto a guardar.
	 */
	void guardar (SubGenero subGenero);
	
	/**
	 * Metodo que permite actualizar un subgenero 
	 * @param subGenero {@link SubGenero} objeto a actualizar.
	 */
	void actualizar (SubGenero subGenero);
	
	/**
	 * Metodo que permite eliminar un subgenero 
	 * @param id {@link Long} identificador del SubGenero a eliminar.
	 */
	void eliminar (Long id);
	
	/**
	 * Metodo que permite consultar la lista de subgeneros.
	 * @return {@link List} lista de subgeneros consultados
	 */
	List<SubGenero> consultar();
	
	/**
	 * Metodo que permite consultar un subgenero a partir de su identificador.
	 * @param id{@link Long } identificador del subgeneo a consultar.
	 * @return {@link subgenero} un objeto consultado.
	 */
	SubGenero consultarById(Long id);

}
