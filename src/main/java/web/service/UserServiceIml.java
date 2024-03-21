package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.dao.UsersDAOImp;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
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
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }


    @Override
    @Transactional
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public void update(long id, User user) {
        userDao.update(id, user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
