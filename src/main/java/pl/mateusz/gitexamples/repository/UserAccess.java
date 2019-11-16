package pl.mateusz.gitexamples.repository;

import pl.mateusz.gitexamples.domain.User;

import java.util.List;

public interface UserAccess {
    List<User> readAlUsers();
}
