package ru.nikolaenko.spring_boot_hibernate.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.nikolaenko.spring_boot_hibernate.repositories.Persons;
import ru.nikolaenko.spring_boot_hibernate.services.MyService;

import java.util.List;

@RestController
public class MyController {

    private MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam(value = "city", required = false) String city){
        return service.getPersonsByCity(city);
    }
}
