package com.raveera.mongodb.springbootmongodbexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.raveera.mongodb.springbootmongodbexample.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses=UserRepository.class)
@Configuration
public class MongoDBConfig {
	

}
