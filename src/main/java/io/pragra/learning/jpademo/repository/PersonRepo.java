package io.pragra.learning.jpademo.repository;

import io.pragra.learning.jpademo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query("select p from Person p where upper( p.lastName) = :lastName")
    List<Person> findAllByLastName(@Param("lastName") String lastName);
}
