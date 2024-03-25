package org.example.repositories;

import org.example.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Neil Alishev
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}