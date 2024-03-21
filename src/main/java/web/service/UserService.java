package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User getUserById(long id);
    void deleteUser(long id);
    void update(long id, User user);
    List<User> getUsers();
}
