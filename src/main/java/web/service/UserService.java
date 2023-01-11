package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();
    void saveUser(User user);
    User showUser(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);
}

