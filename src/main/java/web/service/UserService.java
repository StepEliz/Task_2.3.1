package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User getUserById(int id);
    void deleteUser(int id);
    void update(int id, User user);
    List<User> getUsers();
}
