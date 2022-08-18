package com.task.my_application.model;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String first_name;
    @NonNull
    private String last_name;
    @NonNull
    private String patronymic;
    @NonNull
    private String email;
    @NonNull
    private String telephone_number;
}
