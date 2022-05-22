package com.example.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.lms.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
