package com.monolitica.productos.repository;

import com.monolitica.productos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}