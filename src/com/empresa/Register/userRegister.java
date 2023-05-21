package com.empresa.Register;
import java.util.Scanner;
import com.empresa.models.User;

public class userRegister {
    Scanner reader = new Scanner(System.in);
    private String name;
    private int age;

    public User store(){
        User user = new User();

        System.out.print("Name: ");
        name = reader.nextLine();
        user.setName(name);

        System.out.print("Age: ");
        age = Integer.parseInt(reader.nextLine());
        user.setAge(age);

        return user;

    }
}
