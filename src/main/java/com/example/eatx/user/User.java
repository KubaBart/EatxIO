package com.example.eatx.user;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true, length = 50)
    private String email;
    @Column(nullable = false, length= 64)
    private String password;
    @Column(nullable = false, length= 20)
    private String firstName;
    @Column(nullable = false, length= 20)
    private String lastName;
    @Column(nullable = false, length= 9)
    private String number;

    boolean enable;

    public User()
    {

    }

    public User(String email, String password, String firstName, String lastName, String number) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }
}
