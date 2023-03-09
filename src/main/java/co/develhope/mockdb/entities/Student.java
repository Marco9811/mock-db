package co.develhope.mockdb.entities;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;

    @Column(unique = true, name = "user_email")
    private String email;
}