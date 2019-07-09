package com.raveera.mongodb.springbootmongodbexample.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.raveera.mongodb.springbootmongodbexample.document.User;
import com.raveera.mongodb.springbootmongodbexample.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses=UserRepository.class)
@Configuration
public class MongoDBConfig {
	
	/**
	 * 
	 * @param userRepository
	 * @return
	 * This CommandLineRunner will be invoked by spring when app satrts up and
	 *  inject userrepository.
	 * 
	 */
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return new CommandLineRunner() {			
			@Override
			public void run(String... args) throws Exception {
				userRepository.save(new User(1, "Saman", "Kumara", 45000L, 25));
				userRepository.save(new User(2, "Kamal", "Perera", 35000L, 27));
			}
		};
	}
	

}
