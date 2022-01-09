package br.com.web.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="user")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    
    private List<Post> posts;


}
