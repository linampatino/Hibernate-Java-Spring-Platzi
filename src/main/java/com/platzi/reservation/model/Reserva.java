/**
 * 
 */
package com.platzi.reservation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Representa la tabla reservas
 * @author lina.patino
 *
 */
@Data
@Entity
@Table(name = "reservas")
public class Reserva {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idReserva;
	
	@Temporal(TemporalType.DATE)
	private Date fechaInicioReserva;
	
	@Temporal(TemporalType.DATE)
	private Date fechafinReserva;
	private int cantidadPersonas;
	private String Descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}

}
