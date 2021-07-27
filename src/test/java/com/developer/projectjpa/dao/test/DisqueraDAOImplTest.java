/**
 * 
 */
package com.developer.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.developer.projectjpa.dao.DisqueraDAO;
import com.developer.projectjpa.entity.Disquera;
import com.developer.projectjpa.impl.DisqueraDAOImpl;

/**
 * @author Junior Mendez
 *
 */
class DisqueraDAOImplTest {
	
	DisqueraDAO disqueraDAO = new DisqueraDAOImpl();

	/**
	 * Test method for {@link com.developer.projectjpa.impl.DisqueraDAOImpl#guardar(com.developer.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		Disquera disquera = new Disquera();
		
		disquera.setDescripcion("MegaForce");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		
		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.developer.projectjpa.impl.DisqueraDAOImpl#actualizar(com.developer.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarById(10L);
		
		disqueraConsultada.setDescripcion("Disquera IronMaiden");
		
		this.disqueraDAO.actualizar(disqueraConsultada);
	}

	/**
	 * Test method for {@link com.developer.projectjpa.impl.DisqueraDAOImpl#eliminar(com.developer.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		
		Long id = 9L;
		
		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for {@link com.developer.projectjpa.impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		 List<Disquera> disqueraConsultadas = this.disqueraDAO.consultar();
		 
		assertTrue(disqueraConsultadas.size()>0);
		disqueraConsultadas.forEach(disquera -> {
			 System.out.println("Disquera: " + disquera.getDescripcion());
		 });
	}

	/**
	 * Test method for {@link com.developer.projectjpa.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		
		Disquera disquera = this.disqueraDAO.consultarById(9L);
		assertNotNull(disquera);
		System.out.println("Disquera: "+ disquera.getDescripcion());
	}
	
	@Test
	void consultarByDescripcionJPQL() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarByDescripcionJPQL("Disquera IronMaiden");
		
		assertNotNull(disqueraConsultada);
		
		System.out.println("Disquera by descripcion: "+ disqueraConsultada.getDescripcion());
	}
	
	@Test
	void consultarByDescripcionNative() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarByDescripcionNative("Disquera IronMaiden");
		
		assertNotNull(disqueraConsultada);
		
		System.out.println("Disquera by descripcion: "+ disqueraConsultada.getDescripcion());
	}

}
