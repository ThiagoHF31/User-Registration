package com.empresa.repositories;
import com.empresa.models.User;
import java.util.List;
import java.util.ArrayList;

public class UserRepository {
    List<User> users = new ArrayList<User>();

    private int id = 0;

    public List<User> findAll(){
        return users;
    }

    public void save(User user){
        user.setId(++id);

        users.add(user);
    }
}
