package pl.mateusz.gitexamples.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private String login;
    private String haslo;


    List<User> readAllUserFromDB(){


        return Collections.emptyList();
    }
}
