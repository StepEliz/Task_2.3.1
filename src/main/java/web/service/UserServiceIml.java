package web.service;

import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.dao.UsersDAOImp;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserServiceIml implements UserService {

    private final UserDao userDao;

    public UserServiceIml(UsersDAOImp usersDAOImp) {
        userDao = usersDAOImp;
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }


    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public void update(int id, User user) {
        userDao.update(id, user);
    }

    @Override
    @Transactional
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
