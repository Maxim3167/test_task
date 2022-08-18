package com.task.my_application.controller;

import com.task.my_application.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.task.my_application.repository.UserRepository;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
//@Api("Контроллер для работы с моделью User")
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("{firstName}/{lastName}/{patronymic}/{email}/{telephoneNumber}")
    public void registration(@PathVariable String firstName,
                             @PathVariable String lastName,
                             @PathVariable String patronymic,
                             @PathVariable String email,
                             @PathVariable String telephoneNumber){
        userRepository.save(new User(firstName,lastName,patronymic,email,telephoneNumber));
    }
}
