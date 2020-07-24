package io.pragra.learning.jpademo.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
public class Person extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 300, nullable = true)
    private String firstName;

    @Column(length = 300, nullable = true)
    private String lastName;

    public Person() {
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.createDate = new Date();
        this.lastUpdateDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
