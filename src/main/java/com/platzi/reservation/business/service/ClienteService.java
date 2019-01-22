/**
 * 
 */
package com.platzi.reservation.business.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.reservation.business.repository.ClienteRepository;
import com.platzi.reservation.model.Cliente;

/**
 * Clase para definir los servicios de cliente
 * @author lina.patino
 *
 */
@Transactional
@Service
public class ClienteService {
	
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	@Transactional
	public void delete(Cliente cliente){
		this.clienteRepository.delete(cliente);
	}
	
	public Cliente findByIdentificacion(String identificacion) {
		return clienteRepository.findByIdentificacion(identificacion);
	}
	
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}

}
