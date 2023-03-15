package ru.maxima.demodocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.maxima.demodocker.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Long> {
}
