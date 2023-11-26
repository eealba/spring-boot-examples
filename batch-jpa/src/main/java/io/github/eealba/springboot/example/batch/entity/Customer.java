package io.github.eealba.springboot.example.batch.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    String firstName;
    String lastName;
    LocalDate birthdate;
    
 }
