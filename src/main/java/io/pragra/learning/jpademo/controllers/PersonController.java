package io.pragra.learning.jpademo.controllers;
// DAO
// REP

import io.pragra.learning.jpademo.entity.Person;
import io.pragra.learning.jpademo.repository.PersonEntityRepo;
import io.pragra.learning.jpademo.repository.PersonRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private PersonRepo repo;

    public PersonController(PersonRepo repo) {
        this.repo = repo;
    }

    @PostMapping("/person")
    public Person savePerson(@RequestBody Person person){
        return repo.save(person);
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Long id){
        return repo.findById(id).get();
    }

    @PutMapping("/person/{id}")
    public Person updatePerson(@RequestBody Person person, @PathVariable Long id) {
        person.setId(id);
        return repo.save(person);
    }

    @GetMapping("/person")
    public List<Person> getAll() {
        return this.repo.findAll();
    }

    @GetMapping("/person/lastname/{lastName}")
    public List<Person> getAllByLastName(@PathVariable String lastName){
        return this.repo.findAllByLastName(lastName.toUpperCase());
    }
}
