package ru.maxima.demodocker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.maxima.demodocker.models.Person;
import ru.maxima.demodocker.repository.PeopleRepository;

import java.util.List;

@Controller
public class HelloController {

    private final PeopleRepository peopleRepository;

    @Autowired
    public HelloController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @ResponseBody
    @GetMapping("/people")
    public List<Person> getPeople() {
        return peopleRepository.findAll();
    }

}
