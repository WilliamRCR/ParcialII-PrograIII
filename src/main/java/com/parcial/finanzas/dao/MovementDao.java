package com.parcial.finanzas.dao;

import com.parcial.finanzas.entities.Movement;
import org.springframework.data.repository.CrudRepository;

public interface MovementDao extends CrudRepository<Movement, Long> {
}
