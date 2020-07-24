package io.pragra.learning.jpademo.repository;

import io.pragra.learning.jpademo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonEntityRepo {

    @PersistenceContext
    private EntityManager manager;

    //R - READ
    public Person getPersonById(Long id){
        return manager.find(Person.class, id);
    }

    //UPDATE. INSERT
    public Person savePerson(Person person){
        return manager.merge(person);
    }

    public void deleteById(Long id) {
        Person person = getPersonById(id);
        manager.detach(person);
    }


}
