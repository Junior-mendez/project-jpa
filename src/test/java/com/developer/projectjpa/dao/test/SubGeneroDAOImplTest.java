/**
 * 
 */
package com.developer.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.developer.projectjpa.dao.SubGeneroDAO;
import com.developer.projectjpa.entity.Genero;
import com.developer.projectjpa.entity.SubGenero;
import com.developer.projectjpa.impl.SubGeneroDAOImpl;

/**
 * @author Junior Mendez
 * Clase test para comprobar el funcionamiento de los metodos del CRUD SubGenero.
 */
class SubGeneroDAOImplTest {
	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();
	/**
	 * Test method for {@link com.developer.projectjpa.impl.SubGeneroDAOImpl#guardar(com.developer.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		
		subGenero.setDescripcion("Hard Core");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero = new Genero();
		
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		
		this.subGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for {@link com.developer.projectjpa.impl.SubGeneroDAOImpl#actualizar(com.developer.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subGeneroConsultado =this.subGeneroDAO.consultarById(7L);
		
		subGeneroConsultado.setDescripcion("Trash Metal");
		subGeneroConsultado.getGenero().setDescripcion("Metal Trash");
		
		this.subGeneroDAO.actualizar(subGeneroConsultado);
	}

	/**
	 * Test method for {@link com.developer.projectjpa.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(7L);
	}

	/**
	 * Test method for {@link com.developer.projectjpa.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGenerosConsultados =subGeneroDAO.consultar();
		
		for (SubGenero subGenero : subGenerosConsultados) {
			System.out.println("SubGenero: "+subGenero.getDescripcion());
			System.out.println("Genero: "+subGenero.getGenero().getDescripcion());
		}
	}

	/**
	 * Test method for {@link com.developer.projectjpa.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
