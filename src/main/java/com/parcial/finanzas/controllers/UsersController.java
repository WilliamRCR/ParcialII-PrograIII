package com.parcial.finanzas.controllers;

import com.parcial.finanzas.entities.Users;
import com.parcial.finanzas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<Users> Get(){return userService.get();}

    @GetMapping(value="/{id}")
    public Users GetById(Long id){return userService.getById(id);}

    @PostMapping
    public void create(@RequestBody Users user){userService.create(user);}

    @PutMapping(value="/{id}")
    public void update(@PathVariable Long id,
                       @RequestBody Users user){
        userService.update(id, user);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){userService.delete(id);}



}
