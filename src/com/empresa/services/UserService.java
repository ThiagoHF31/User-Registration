package com.empresa.services;
import com.empresa.models.User;
import com.empresa.repositories.UserRepository;
import java.util.List;

public class UserService {
    UserRepository userRepository = new UserRepository();

    public List<User> index(){
        return userRepository.findAll();
    }
    public void store(User user){
        userRepository.save(user);

    }
}
