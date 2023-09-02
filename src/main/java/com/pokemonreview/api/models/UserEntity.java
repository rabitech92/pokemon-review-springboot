package com.pokemonreview.api.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
;
import java.util.ArrayList;
import java.util.List;



@Data
@NoArgsConstructor
@Document(collection = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private Role roles;


}
