package pl.mateusz.gitexamples.repository;

import org.springframework.stereotype.Repository;
import pl.mateusz.gitexamples.domain.User;

import java.util.Arrays;
import java.util.List;

@Repository
public class FakeRepo implements UserAccess {



    @Override
    public List<User> readAlUsers() {
        return Arrays.asList(
                new User("admin","admin"),
                new User("user","123"),
                new User("student","54321")
        );
    }
}
