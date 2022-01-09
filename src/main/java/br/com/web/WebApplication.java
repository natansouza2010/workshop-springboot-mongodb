package br.com.web;

import br.com.web.domain.entities.User;
import br.com.web.domain.repository.UserRepository;
import br.com.web.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

//    @Autowired
//    private UserService userService;
//    @Override
//    public void run(String... args) throws Exception{
//
//
//    }

}
