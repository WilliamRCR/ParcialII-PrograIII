package com.parcial.finanzas.dao;

import com.parcial.finanzas.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersDao extends CrudRepository<Users, Long> {
}
