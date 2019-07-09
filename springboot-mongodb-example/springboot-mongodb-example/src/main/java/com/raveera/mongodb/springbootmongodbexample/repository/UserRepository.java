package com.raveera.mongodb.springbootmongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.raveera.mongodb.springbootmongodbexample.document.User;

public interface UserRepository extends MongoRepository<User, Integer>{

}
