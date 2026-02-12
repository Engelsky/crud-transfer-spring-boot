package org.example.crudtransferspringboot.repository;

import org.example.crudtransferspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}