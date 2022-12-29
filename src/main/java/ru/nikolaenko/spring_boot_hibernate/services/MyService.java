package ru.nikolaenko.spring_boot_hibernate.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ru.nikolaenko.spring_boot_hibernate.repositories.MyRepositoryImpl;
import ru.nikolaenko.spring_boot_hibernate.repositories.Persons;

import java.util.List;

@Service
public class MyService {

    private MyRepositoryImpl repository;

    public MyService(MyRepositoryImpl repository) {
        this.repository = repository;
    }

    @Transactional
    public List<Persons> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
