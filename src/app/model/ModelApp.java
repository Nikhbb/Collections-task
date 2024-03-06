package app.model;

import app.entity.User;

import java.util.Arrays;
import java.util.List;

public class ModelApp {

    public List<User> initList() {
        return Arrays.asList(
                new User("Ann", "ann@gmail.com"),
                new User("Ivan", "ivan@ukr.net"),
                new User("Jon", "jon@i.ua"),
                new User("Tom", "tom@gmail.com"),
                new User("Fox", "fox@gmail.com")
        );
    }
}
