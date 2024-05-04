package com.parcial.finanzas.controllers;

import com.parcial.finanzas.entities.Movement;
import com.parcial.finanzas.services.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movement")
public class MovementController {
    @Autowired
    MovementService movementService;

    @GetMapping
    public List<Movement> Get(){return movementService.get();}

    @GetMapping(value = "/{id}")
    public Movement GetById(Long id){return movementService.getById(id);}

    @PostMapping
    public void create(@RequestBody Movement movement){movementService.create(movement);}

    @PutMapping(value = "/{id}")
    public void update(@PathVariable Long id,
                       @RequestBody Movement movement){
        movementService.update(id, movement);
    }

    @DeleteMapping(value = "/{id}")
    public void delete (@PathVariable Long id){movementService.delete(id);}
}
