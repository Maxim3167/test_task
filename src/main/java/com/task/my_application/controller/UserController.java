package com.task.my_application.controller;

import com.task.my_application.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.task.my_application.repository.UserRepository;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@Api(description = "Контроллер для работы с моделью User")
public class UserController {

    private final UserRepository userRepository;
    @ApiOperation("Регистрация пользователя")
    @PostMapping("{firstName}/{lastName}/{patronymic}/{email}/{telephoneNumber}")
    public void registration(@PathVariable String firstName,
                             @PathVariable String lastName,
                             @PathVariable String patronymic,
                             @PathVariable String email,
                             @PathVariable String telephoneNumber){
        userRepository.save(new User(firstName,lastName,patronymic,email,telephoneNumber));
    }

    @ApiOperation("Получение данных о пользователе по его id")
    @GetMapping("{id}")
    public User getById(@PathVariable int id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("No user with id " + id));
    }
}
