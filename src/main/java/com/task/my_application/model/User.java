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

}
