package com.parcial.finanzas.services;

import com.parcial.finanzas.entities.Movement;

import java.util.List;

public interface MovementService {
    public List<Movement> get();
    public Movement getById(Long id);
    public void create(Movement movement);
    public void update(Long id, Movement movement);
    public void delete(Long id);
}
