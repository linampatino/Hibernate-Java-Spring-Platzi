/**
 * 
 */
package com.platzi.reservation.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Representa la tabla cliente
 * @author lina.patino
 *
 */

@Entity
@Table(name = "cliente")
@NamedQuery(name="Cliente.findByIdentificacion", query = "Select c from Cliente c where c.identificacion = ?1")
@Data
public class Cliente {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name = "system-uuid", strategy="uuid2")
	private String idCliente;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String direccion;
	private String telefono;
	private String email;
	
	@OneToMany(mappedBy = "cliente")
	private Set<Reserva> reservas;
	
	public Cliente() {
		
	}

}
