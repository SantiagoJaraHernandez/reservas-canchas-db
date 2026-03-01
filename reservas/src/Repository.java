package com.reservas.repository;

import com.reservas.model.Reserva;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.time.*;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    @Query("""
    SELECT r FROM Reserva r
    WHERE r.idCancha = :idCancha
    AND r.fecha = :fecha
    AND (
        (:horaInicio BETWEEN r.horaInicio AND r.horaFin)
     OR (:horaFin BETWEEN r.horaInicio AND r.horaFin)
     OR (r.horaInicio BETWEEN :horaInicio AND :horaFin)
    )
    """)
    List<Reserva> validarSolapamiento(
            @Param("idCancha") Long idCancha,
            @Param("fecha") LocalDate fecha,
            @Param("horaInicio") LocalTime horaInicio,
            @Param("horaFin") LocalTime horaFin
    );
}