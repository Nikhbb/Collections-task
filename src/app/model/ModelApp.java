package app.model;

import app.entity.User;

import java.util.ArrayList;
import java.util.List;

public class ModelApp {

    public List<User> initList() {
        List<User> users = new ArrayList<>();
        users.add(0, new User("Ann", "ann@gmail.com"));
        users.add(1, new User("Ivan", "ivan@ukr.net"));
        users.add(2, new User("Jon", "jon@i.ua"));
        users.add(3, new User("Tom", "tom@gmail.com"));
        users.add(4, new User("Fox", "fox@gmail.com"));
        return users;
    }
}
