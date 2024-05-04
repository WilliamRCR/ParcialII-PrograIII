package com.parcial.finanzas.services;

import com.parcial.finanzas.dao.UsersDao;
import com.parcial.finanzas.entities.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UsersDao usersDao;
    @Override
    public List<Users> get() {
        return (List<Users>) usersDao.findAll();
    }

    @Override
    public Users getById(Long id) {
        return usersDao.findById(id).orElse(null);
    }

    @Override
    public void create(Users user) {
        usersDao.save(user);
    }

    @Override
    public void update(Long id, Users user) {
        if(usersDao.existsById(id)){
            user.setId(id);
            usersDao.save(user);
        }
    }

    @Override
    public void delete(Long id) {
        if(usersDao.existsById(id)){
            usersDao.deleteById(id);
        }
    }
}
