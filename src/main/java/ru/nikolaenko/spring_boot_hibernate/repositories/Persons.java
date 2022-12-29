package ru.nikolaenko.spring_boot_hibernate.repositories;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Persons {

    @EmbeddedId
    private Contact contact;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String phoneNumber;
}
