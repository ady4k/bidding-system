package collections.service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ListService {
    // useri
    private static List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void getUsers() {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
    // produse


    // licitatii


}
