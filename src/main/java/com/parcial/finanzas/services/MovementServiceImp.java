package com.parcial.finanzas.services;

import com.parcial.finanzas.dao.MovementDao;
import com.parcial.finanzas.entities.Movement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementServiceImp implements MovementService{
    @Autowired
    MovementDao movementDao;
    @Override
    public List<Movement> get() {
        return (List<Movement>) movementDao.findAll() ;
    }

    @Override
    public Movement getById(Long id) {
        return movementDao.findById(id).orElse(null);
    }

    @Override
    public void create(Movement movement) {
        movementDao.save(movement);
    }

    @Override
    public void update(Long id, Movement movement) {
        if(movementDao.existsById(id)){
            movement.setUserId(id);
            movementDao.save(movement);
        }
    }

    @Override
    public void delete(Long id) {
        if (movementDao.existsById(id)) {
            movementDao.deleteById(id);
        }
    }
}
