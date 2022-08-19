package com.task.my_application.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
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

    public User(int id, @NonNull String first_name,
                @NonNull String last_name,
                @NonNull String patronymic,
                @NonNull String email,
                @NonNull String telephone_number) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.patronymic = patronymic;
        this.email = email;
        this.telephone_number = telephone_number;
    }
}
