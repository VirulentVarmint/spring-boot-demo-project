package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

@Service
public class UserService {

    private final List<User> userList = new ArrayList<>(
            Arrays.asList(
                    new User("Ivan", "Ivanov", "123456"),
                    new User("Sergey", "Sergeev", "987654"),
                    new User("Dmitry", "Dmitriev", "456123")
            )
    );

    public List<User> getUsers() {
        return userList;
    }

    public User getUserById(int id) {
        return userList.get(id-1);
    }

    public User createUer(User newUser) {
        userList.add(newUser);
        return newUser;
    }

    public User updateUser(int id, User user) {
        userList.get(id-1).updateUser(user);
        return userList.get(id-1);
    }

    public List<User> deleteUser(int id) {
        userList.remove(id-1);
        userList.get(0).setIdTracker(userList.size());
        for (int i = id; i <= userList.size(); i++) {
            userList.get(i-1).setId(i);
        }
        return userList;
    }
}
