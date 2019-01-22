/**
 * 
 */
package com.platzi.reservation.business.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.reservation.model.Cliente;

/**
 * Interface para definir las operacines de bd relacionadas con el cliente
 * @author lina.patino
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
	public List<Cliente> findByApellido(String apellido);
	public Cliente findByIdentificacion(String identificacion);
	
	
	
}
