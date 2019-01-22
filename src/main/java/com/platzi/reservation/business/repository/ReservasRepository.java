/**
 * 
 */
package com.platzi.reservation.business.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platzi.reservation.model.Reserva;

/**
 * @author lina.patino
 *
 */
public interface ReservasRepository extends JpaRepository<Reserva, String>{

	@Query("Select r from Reserva r where r.fechaInicioReserva =: fechaInicio and r.fechafinReserva =: fechaFin")
	public List<Reserva> find(@Param("fechaInicio") Date fechaInicio, @Param("fechaInicio")Date fechaFin);
	
}
