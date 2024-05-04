package com.parcial.finanzas.services;

import com.parcial.finanzas.entities.Users;

import java.util.List;

public interface UserService {
    public List<Users> get();
    public Users getById(Long id);
    public void create(Users user);
    public void update(Long id, Users user);
    public void delete(Long id);
}
