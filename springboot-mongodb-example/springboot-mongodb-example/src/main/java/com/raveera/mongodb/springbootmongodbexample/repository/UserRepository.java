package com.raveera.mongodb.springbootmongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory;

import com.raveera.mongodb.springbootmongodbexample.document.User;

public interface UserRepository extends MongoRepository<User, Integer>{

}
