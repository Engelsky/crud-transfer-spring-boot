package org.example.crudtransferspringboot;

import jakarta.annotation.PostConstruct;
import org.example.crudtransferspringboot.model.User;
import org.example.crudtransferspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitData {

    private final UserService userService;

    @Autowired
    public InitData(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init(){
        User user1 = new User("Yaropolk", "Ponosov", "YaropolkPonosov@mail.ru");
        User user2 = new User("Maxim", "Kakunin", "MaximKakunin@gmail.com");
        User user3 = new User("Arina", "Amoralnaya", "ArinaAmoralnaya@yandex.ru");
        User user4 = new User("Semen", "Blueval'cev", "SemenBluevalcev@outlook.com");

        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
        userService.saveUser(user4);

        System.out.println("Users initialized successfully!");
    }
}