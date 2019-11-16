package pl.mateusz.gitexamples.service;



import org.springframework.stereotype.Service;
import pl.mateusz.gitexamples.domain.User;
import pl.mateusz.gitexamples.repository.UserAccess;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private UserAccess userAccess;

    public UserService(UserAccess userAccess) {
        this.userAccess = userAccess ;
    }

    public List<User> getAllUser(){
        return userAccess.readAlUsers();
    }
}
