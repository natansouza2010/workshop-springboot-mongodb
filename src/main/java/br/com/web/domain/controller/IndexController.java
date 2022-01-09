package br.com.web.domain.controller;

import br.com.web.domain.entities.User;
import br.com.web.domain.repository.UserRepository;
import br.com.web.domain.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class IndexController {
    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public ResponseEntity<?> list(){
        List<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<Optional<User>> view(@PathVariable Long id){

        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()){

            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.ok(user);
        }
    }
}
